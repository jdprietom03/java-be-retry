package com.bootcamp.Joyeria.service;

import com.bootcamp.Joyeria.dto.request.StudentDTO;
import com.bootcamp.Joyeria.dto.response.MessageResponseDTO;

public interface IStudentService {
    public MessageResponseDTO createStudent(StudentDTO student);
}
