package com.geekster.UniversityEventManagement.repository;

import com.geekster.UniversityEventManagement.models.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends CrudRepository<Student,Integer> {
    @Query(value="select * from STUDENT where STUDENT_ID=:id", nativeQuery = true)
    public List<Student> getById(Integer id);

    @Modifying
    @Query(value="update STUDENT set DEPT=:dept where STUDENT_ID=:id", nativeQuery = true)
    public void updateDept(String dept,Integer id);

    @Modifying
    @Query(value="Delete from STUDENT where STUDENT_ID<=:id", nativeQuery = true)
    public void removeStudent(Integer id);
}
