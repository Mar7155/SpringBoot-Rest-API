package com.application.rest.SpringBootRest.service.impl;

import com.application.rest.SpringBootRest.entities.Maker;
import com.application.rest.SpringBootRest.persistence.IMakerDAO;
import com.application.rest.SpringBootRest.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MakerServiceImpl implements IMakerService {

    @Autowired
    private IMakerDAO makerDAO;

    @Override
    public List<Maker> findAll() {
        return makerDAO.findAll();
    }

    @Override
    public Optional<Maker> findById(long id) {
        return makerDAO.findById(id);
    }

    @Override
    public void save(Maker maker) {
        makerDAO.save(maker);
    }

    @Override
    public void deleteById(long id) {
        makerDAO.deleteById(id);
    }
}
