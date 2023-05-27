package com.bootcamp.Joyeria.service;

import com.bootcamp.Joyeria.dto.JewelryDTO;
import com.bootcamp.Joyeria.dto.request.IdRequestDTO;
import com.bootcamp.Joyeria.dto.response.IdResponseDTO;
import com.bootcamp.Joyeria.dto.response.ListJewelriesResponseDTO;
import com.bootcamp.Joyeria.dto.response.MessageResponseDTO;

public interface IJewelryService {
    public IdResponseDTO createJewelry(JewelryDTO jewelry);
    public ListJewelriesResponseDTO listJewelries();
    public MessageResponseDTO deleteJewelry(IdRequestDTO id);
    public JewelryDTO updateJewelry(IdRequestDTO id, JewelryDTO jewelry);
}
