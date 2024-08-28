package com.application.rest.service;

import com.application.rest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerService {

    //traer todos
    List<Maker> findAll();

    //Taer por id
    Optional <Maker> findById(Long id);

    //Guarder
    void save(Maker maker);

    //Borrar por id
    void delete(Long id);
}
