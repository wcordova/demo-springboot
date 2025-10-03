package com.umg.edu.gt.dev.demo.service.impl;

import com.umg.edu.gt.dev.demo.entity.GenericEntity;
import com.umg.edu.gt.dev.demo.repository.GenericRepository;
import com.umg.edu.gt.dev.demo.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenericServiceImpl implements GenericService {

    @Autowired
    private GenericRepository genericRepository;

    @Override
    public List<GenericEntity> findAll() {
        return genericRepository.findAll();
    }

    @Override
    public GenericEntity findById(Long id) {
        Optional<GenericEntity> entity = genericRepository.findById(id);
        return entity.orElse(null);
    }

    @Override
    public GenericEntity save(GenericEntity entity) {
        return genericRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        genericRepository.deleteById(id);
    }
}
