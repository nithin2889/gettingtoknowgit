package com.practice.git.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.git.entities.ManagePayeeEntity;

@Repository
public interface ManagePayeeRepository extends JpaRepository<ManagePayeeEntity, Long> {

}