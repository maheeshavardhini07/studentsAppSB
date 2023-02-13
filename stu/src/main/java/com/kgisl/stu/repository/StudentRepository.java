package com.kgisl.stu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.stu.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
