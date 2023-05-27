package com.bootcamp.Joyeria.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponseDTO implements Serializable {
    private String Message;
    private String status;
}
