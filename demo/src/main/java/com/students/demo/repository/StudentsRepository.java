package com.students.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.students.demo.model.Students;

public interface StudentsRepository extends MongoRepository<Students, String> {
    
}