package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.student;

@Repository

public interface studentrepository extends JpaRepository<student,Long>{

}
