package com.application.rest.SpringBootRest.persistence;

import com.application.rest.SpringBootRest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerDAO {

    List<Maker> findAll();

    Optional<Maker> findById(long id);

    void save(Maker maker);

    void deleteById(long id);

}
