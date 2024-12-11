package com.application.rest.SpringBootRest.persistence.impl;

import com.application.rest.SpringBootRest.entities.Maker;
import com.application.rest.SpringBootRest.persistence.IMakerDAO;
import com.application.rest.SpringBootRest.respository.MakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MakerDAOimpl implements IMakerDAO {

    @Autowired
    private MakerRepository makerRepository;

    @Override
    public List<Maker> findAll() {
        return (List<Maker>) makerRepository.findAll();
    }

    @Override
    public Optional<Maker> findById(long id) {
        return makerRepository.findById(id);
    }

    @Override
    public void save(Maker maker) {
        makerRepository.save(maker);
    }

    @Override
    public void deleteById(long id) {
        makerRepository.deleteById(id);
    }
}
