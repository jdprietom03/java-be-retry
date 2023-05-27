package com.bootcamp.Joyeria.controller;

import com.bootcamp.Joyeria.dto.JewelryDTO;
import com.bootcamp.Joyeria.dto.request.StudentDTO;
import com.bootcamp.Joyeria.dto.response.IdResponseDTO;
import com.bootcamp.Joyeria.dto.response.MessageResponseDTO;
import com.bootcamp.Joyeria.service.IJewelryService;
import com.bootcamp.Joyeria.service.IStudentService;
import com.mysql.cj.protocol.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final IStudentService studentService;
    public StudentController(IStudentService studentService){
        this.studentService =studentService;
    }
    @PostMapping("/student/create")
    public ResponseEntity<MessageResponseDTO> createStudent(@RequestBody StudentDTO student){
        MessageResponseDTO dto = studentService.createStudent(student);
        return new ResponseEntity<>(dto, HttpStatus.ACCEPTED);
    }
}
