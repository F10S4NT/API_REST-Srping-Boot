package com.application.rest.persistence;

import com.application.rest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerDAO {

    //traer todos
    List<Maker> findAll();

    //Taer por id
    Optional <Maker> findById(Long id);

    //Guardar
    void save(Maker maker);

    //Borrar por id
    void delete(Long id);
}
