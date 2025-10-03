package com.umg.edu.gt.dev.demo.repository;

import com.umg.edu.gt.dev.demo.entity.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository extends JpaRepository<GenericEntity, Long> {
}
