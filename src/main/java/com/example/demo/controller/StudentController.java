package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;
import com.example.demo.repository.studentrepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")

public class StudentController {
	@Autowired
	private studentrepository studentRepository;
	@GetMapping("/students")
	public List<student> getAllStudent(){
		return studentRepository.findAll();

}
}