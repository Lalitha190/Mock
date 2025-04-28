package com.example.inter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stu.Student;
@Repository
public interface StudentImp  extends JpaRepository<Student,Integer>{
 
}
