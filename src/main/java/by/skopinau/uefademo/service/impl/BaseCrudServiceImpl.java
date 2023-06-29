package by.skopinau.uefademo.service.impl;

import by.skopinau.uefademo.mapper.BaseMapper;
import by.skopinau.uefademo.repository.BaseRepository;
import by.skopinau.uefademo.service.BaseCrudService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

import static by.skopinau.uefademo.exception.message.ExceptionMessage.ENTITY_NOT_FOUND;

@Transactional(readOnly = true)
public abstract class BaseCrudServiceImpl<E, D> implements BaseCrudService<E, D> {

    @Autowired
    private BaseRepository<E> repository;

    @Autowired
    private BaseMapper<E, D> mapper;

    public List<D> getAll() {
        List<E> entities = repository.findAll();
        return mapper.entityListToDtoList(entities);
    }

    public D getById(UUID id) {
        E entity = getEntityById(id);
        return mapper.entityToDto(entity);
    }

    @Transactional
    public D create(D dto) {
        E entity = buildEntityFromDto(dto);
        E savedEntity = repository.save(entity);
        return mapper.entityToDto(savedEntity);
    }

    @Transactional
    public D update(D dto, UUID id) {
        E entity = getEntityById(id);
        E updatedEntity = updateEntityByDto(entity, dto);
        E savedEntity = repository.save(updatedEntity);
        return mapper.entityToDto(savedEntity);
    }

    @Transactional
    public void delete(UUID id) {
        repository.deleteById(id);
    }

    private E getEntityById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(
                        String.format(ENTITY_NOT_FOUND.getMessage(), id)
                ));
    }

    abstract E buildEntityFromDto(D dto);

    abstract E updateEntityByDto(E entity, D dto);
}
