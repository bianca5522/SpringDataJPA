package com.jparelations.school.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping
    Student createStudent(@RequestBody Student student){
       return studentRepository.save(student);
    }

    @GetMapping
    List<Student> getStudents(){
        return studentRepository.findAll();
    }

}
