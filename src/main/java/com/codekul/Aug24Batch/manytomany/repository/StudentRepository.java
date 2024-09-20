package com.codekul.Aug24Batch.manytomany.repository;

import com.codekul.Aug24Batch.manytomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query(value = "select * from fn_get_student_data()",nativeQuery = true)
    List<Map<String,Object>> getStudentData();

}
