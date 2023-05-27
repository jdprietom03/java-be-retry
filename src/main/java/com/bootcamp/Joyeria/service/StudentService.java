package com.bootcamp.Joyeria.service;

import com.bootcamp.Joyeria.dto.request.StudentDTO;
import com.bootcamp.Joyeria.dto.response.IdResponseDTO;
import com.bootcamp.Joyeria.dto.response.MessageResponseDTO;
import com.bootcamp.Joyeria.model.Student;
import com.bootcamp.Joyeria.repository.IJewelryRepository;
import com.bootcamp.Joyeria.repository.IStudentRepository;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Service
public class StudentService implements IStudentService{

    private ModelMapper mapper;
    private final IStudentRepository studentRepository;
    public StudentService(IStudentRepository studentRepository){
        this.studentRepository = studentRepository;
        mapper = new ModelMapper();
    }
    public MessageResponseDTO createStudent(StudentDTO student){
        Student newStudent = mapper.map(student, Student.class);
        studentRepository.save(newStudent);
        MessageResponseDTO dto = new MessageResponseDTO();
        dto.setMessage("Ok");
        return dto;
    }

}
