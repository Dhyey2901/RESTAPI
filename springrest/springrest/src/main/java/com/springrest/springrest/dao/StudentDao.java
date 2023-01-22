package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{}