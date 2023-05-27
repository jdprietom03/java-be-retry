package com.bootcamp.Joyeria.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IdRequestDTO implements Serializable {
    private Integer id;
}
