package com.geekster.UniversityEventManagement.services;

import com.geekster.UniversityEventManagement.models.Student;
import com.geekster.UniversityEventManagement.repository.StudentDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;
    @Transactional
    public String postStudent(List<Student> studentList) {
       Iterable<Student> list=studentDao.saveAll(studentList);
       if(list!=null)
           return "successfully added...!!!";
       else
           return "not addes...!!!";
    }

    public Iterable<Student> fetchAllStudent() {
        return studentDao.findAll();
    }

    public List<Student> fetchStudentById(Integer id) {
        return studentDao.getById(id);
    }
    @Transactional
    public void updateDeptById(String dept, Integer id) {
        studentDao.updateDept(dept,id);
    }

    @Transactional
    public String deleteStudent(Integer id) {
        studentDao.removeStudent(id);
        return "delete successfully";
    }
}
