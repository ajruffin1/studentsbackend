package com.students.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.students.demo.model.Students;
import com.students.demo.repository.StudentsRepository;
import com.students.demo.resource.StudentsRequest;
@CrossOrigin(value= "https://studentsbackendmain.herokuapp.com/")
@RestController
public class StudentsController {
    
    private final StudentsRepository studentsRepository;

    public StudentsController(StudentsRepository studentsRepository){
        this.studentsRepository = studentsRepository;
    }
    @GetMapping("/students")
    public ResponseEntity<List<Students>> getAllStudents(){
        return ResponseEntity.ok(this.studentsRepository.findAll());
    }
    @PostMapping("/students")
    public ResponseEntity<Students> createStudents(@RequestBody StudentsRequest studentsRequest){
        Students students = new Students();
        students.setFirstName(studentsRequest.getFirstName());
        students.setLastName(studentsRequest.getLastName());
        return ResponseEntity.status(201).body(this.studentsRepository.save(students));
    }
    @GetMapping("/students/{id}")
    public ResponseEntity getStudentsById(@PathVariable String id) {

        Optional<Students> students = this.studentsRepository.findById(id);

        if(students.isPresent()) {
            return ResponseEntity.ok(students.get());
        } else {
            return ResponseEntity.ok("The students with id: " + id + " was not found.");
        }
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity deleteStudentsById(@PathVariable String id) {

        Optional<Students> students = this.studentsRepository.findById(id);

        if(students.isPresent()) {
            this.studentsRepository.deleteById(id);
            return ResponseEntity.ok("Success.");
        } else {
            return ResponseEntity.ok("The students with id: " + id + " was not found.");
        }
}
}
