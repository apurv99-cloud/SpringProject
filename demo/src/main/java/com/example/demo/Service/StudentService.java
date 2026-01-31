package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepo;
import com.example.demo.models.Students;

@Service
public class StudentService {
    private StudentRepo student;

    public void addStudent(Students s) {

        // TODO Auto-generated method stub
        student.save(s);
    }

    public StudentRepo getStudent() {
        return student;
    }

    @Autowired
    public void setStudent(StudentRepo student) {
        this.student = student;
    }

    public List<Students> getStudents() {
        // TODO Auto-generated method stub
        return student.findAll();
    }

}
