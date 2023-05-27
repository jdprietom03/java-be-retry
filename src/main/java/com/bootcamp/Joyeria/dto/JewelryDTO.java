package com.bootcamp.Joyeria.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class JewelryDTO implements Serializable {
    private Integer nroIdentificatorio;
    private String material;
    private Double peso;
    private Double kilates;
    private String particularidad;
    private Boolean poseePiedra;
    private Boolean ventaONo;
}
