package com.bootcamp.Joyeria.dto.response;

import lombok.*;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponseDTO implements Serializable {
    private String message;
}
