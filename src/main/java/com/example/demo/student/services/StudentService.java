package com.example.demo.student.services;

import com.example.demo.student.models.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1l,
                        "Marko Markovic",
                        "mm01@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        );
    }

}
