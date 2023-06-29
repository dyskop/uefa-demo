package by.skopinau.uefademo.service;

import java.util.List;
import java.util.UUID;

public interface BaseCrudService<E, D> {

    List<D> getAll();

    D getById(UUID id);

    D create(D dto);

    D update(D dto, UUID id);

    void delete(UUID id);
}
