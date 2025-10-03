package com.umg.edu.gt.dev.demo.service;

import com.umg.edu.gt.dev.demo.entity.GenericEntity;
import java.util.List;

public interface GenericService {
    List<GenericEntity> findAll();
    GenericEntity findById(Long id);
    GenericEntity save(GenericEntity entity);
    void deleteById(Long id);
}
