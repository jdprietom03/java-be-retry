package com.bootcamp.Joyeria.exceptions;

import com.bootcamp.Joyeria.dto.response.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = RestController.class)
public class GlobalExceptionHandler {
    @ExceptionHandler(ErrorException.class)
    public ResponseEntity<?> UserIdDoesNotExist(Exception e){
        return new ResponseEntity<>(new ExceptionResponseDTO(e.getMessage(),"400"), HttpStatus.BAD_REQUEST);
    }
}
