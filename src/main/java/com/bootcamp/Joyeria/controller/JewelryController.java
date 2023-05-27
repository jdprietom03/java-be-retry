package com.bootcamp.Joyeria.controller;

import com.bootcamp.Joyeria.dto.JewelryDTO;
import com.bootcamp.Joyeria.dto.request.IdRequestDTO;
import com.bootcamp.Joyeria.dto.response.IdResponseDTO;
import com.bootcamp.Joyeria.dto.response.ListJewelriesResponseDTO;
import com.bootcamp.Joyeria.dto.response.MessageResponseDTO;
import com.bootcamp.Joyeria.service.IJewelryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JewelryController {
    private final IJewelryService jewelryService;
    public JewelryController(IJewelryService jewelryRepository){
        this.jewelryService =jewelryRepository;
    }
    @PostMapping("/jewerly/new")
    public ResponseEntity<IdResponseDTO> createJewelry(@RequestBody JewelryDTO jewelry){
        IdResponseDTO dto = jewelryService.createJewelry(jewelry);
        return new ResponseEntity<>(dto, HttpStatus.ACCEPTED);
    }

    @GetMapping("/jewerly")
    public ResponseEntity<ListJewelriesResponseDTO> listJewelries(){
        ListJewelriesResponseDTO dto= jewelryService.listJewelries();
        return new ResponseEntity<>(dto, HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/jewerly/delete")
    public ResponseEntity<MessageResponseDTO> deleteJewelry(@RequestParam(name="id_number") Integer idNumber){
        MessageResponseDTO dto= jewelryService.deleteJewelry(new IdRequestDTO(idNumber));
        return new ResponseEntity<>(dto, HttpStatus.ACCEPTED);
    }
    @PutMapping("jewerly/update")
    public ResponseEntity<JewelryDTO> updateJewelry(@RequestParam(name="id_number") Integer idNumber,
                                                 @RequestBody JewelryDTO jewelry){
        JewelryDTO dto = jewelryService.updateJewelry(new IdRequestDTO(idNumber),jewelry);
        return new ResponseEntity<>(dto,HttpStatus.ACCEPTED);
    }
}
