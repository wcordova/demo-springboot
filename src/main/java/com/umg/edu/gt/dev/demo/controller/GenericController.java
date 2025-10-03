package com.umg.edu.gt.dev.demo.controller;

import com.umg.edu.gt.dev.demo.entity.GenericEntity;
import com.umg.edu.gt.dev.demo.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/generic")
public class GenericController {

    @Autowired
    private GenericService genericService;

    @GetMapping
    public List<GenericEntity> getAll() {
        return genericService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenericEntity> getById(@PathVariable Long id) {
        GenericEntity entity = genericService.findById(id);
        return entity != null ? new ResponseEntity<>(entity, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public GenericEntity create(@RequestBody GenericEntity entity) {
        return genericService.save(entity);
    }

    @PutMapping
    public GenericEntity update(@RequestBody GenericEntity entity) {
        return genericService.save(entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        genericService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
