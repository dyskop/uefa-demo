package by.skopinau.uefademo.mapper;

import java.util.List;

public interface BaseMapper<E, D> {

    D entityToDto(E entity);

    List<D> entityListToDtoList(List<E> entities);
}
