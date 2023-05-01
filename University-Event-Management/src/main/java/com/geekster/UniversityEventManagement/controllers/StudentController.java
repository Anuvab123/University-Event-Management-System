package com.geekster.UniversityEventManagement.controllers;

import com.geekster.UniversityEventManagement.models.Event;
import com.geekster.UniversityEventManagement.models.Student;
import com.geekster.UniversityEventManagement.services.StudentService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping(value="/addstudent")
    public String AddStudent(@Valid @RequestBody List<Student> studentList){
        return studentService.postStudent(studentList);
    }

    @GetMapping(value="/getsudents")
    public Iterable<Student> getAllStudent(){
        return studentService.fetchAllStudent();
    }

    @GetMapping(value="/getValueById/{id}")
    public List<Student> getStudentById(@PathVariable Integer id){
        return studentService.fetchStudentById(id);
    }

    @PutMapping(value="/dept/{dept}/id/{id}")
    public void updateStudentDeptById(@PathVariable String dept, @PathVariable Integer id){
        studentService.updateDeptById(dept,id);
    }

    @DeleteMapping(value="/delete/{id}")
    public String deleteStudentById(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }

}
