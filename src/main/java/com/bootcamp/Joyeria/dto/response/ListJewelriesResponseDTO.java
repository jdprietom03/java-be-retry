package com.bootcamp.Joyeria.dto.response;

import com.bootcamp.Joyeria.dto.JewelryDTO;
import lombok.*;

import java.io.Serializable;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListJewelriesResponseDTO implements Serializable{
    private List<JewelryDTO> jewelries;

}
