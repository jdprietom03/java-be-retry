package com.bootcamp.Joyeria.service;

import com.bootcamp.Joyeria.dto.JewelryDTO;
import com.bootcamp.Joyeria.dto.request.IdRequestDTO;
import com.bootcamp.Joyeria.dto.response.IdResponseDTO;
import com.bootcamp.Joyeria.dto.response.ListJewelriesResponseDTO;
import com.bootcamp.Joyeria.dto.response.MessageResponseDTO;
import com.bootcamp.Joyeria.exceptions.ErrorException;
import com.bootcamp.Joyeria.model.Joya;
import com.bootcamp.Joyeria.repository.IJewelryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JewelryService implements IJewelryService {
    private final IJewelryRepository jewelryRepository;
    private ModelMapper mapper;
    public JewelryService(IJewelryRepository jewelryRepository){
        this.jewelryRepository= jewelryRepository;
        mapper = new ModelMapper();
    }

    @Override
    public IdResponseDTO createJewelry(JewelryDTO jewelry) {
        Joya newJoya = mapper.map(jewelry, Joya.class);
        newJoya.setVentaONo(true);
        jewelryRepository.save(newJoya);
        IdResponseDTO dto = new IdResponseDTO();
        dto.setId(newJoya.getNroIdentificatorio());
        return dto;
    }

    @Override
    public ListJewelriesResponseDTO listJewelries() {
        ListJewelriesResponseDTO dto = new ListJewelriesResponseDTO();
        List<Joya> jewelries = jewelryRepository.findByVentaONo(true);
        dto.setJewelries(getListDTO(jewelries));
        return dto;
    }

    @Override
    public MessageResponseDTO deleteJewelry(IdRequestDTO id) {
        Joya currentJoya = jewelryRepository.findById(id.getId()).orElse(null);
        if(currentJoya ==null) throw  new ErrorException("The user id does not exist");
        currentJoya.setVentaONo(false);
        jewelryRepository.save(currentJoya);
        return new MessageResponseDTO("Successful process");
    }

    @Override
    public JewelryDTO updateJewelry(IdRequestDTO id, JewelryDTO jewelry) {
        Joya currentJoya = jewelryRepository.findById(id.getId()).orElse(null);
        if(currentJoya ==null) throw  new ErrorException("The user id does not exist");
        if(jewelry.getMaterial()!=null) currentJoya.setMaterial(jewelry.getMaterial());
        if(jewelry.getPeso()!=null) currentJoya.setPeso(jewelry.getPeso());
        if(jewelry.getKilates()!=null) currentJoya.setKilates(jewelry.getKilates());
        if(jewelry.getParticularidad()!=null) currentJoya.setParticularidad(jewelry.getParticularidad());
        if(jewelry.getPoseePiedra()!=null) currentJoya.setPoseePiedra(jewelry.getPoseePiedra());
        jewelryRepository.save(currentJoya);
        JewelryDTO dto = mapper.map(currentJoya,JewelryDTO.class);
        return dto;
    }

    private List<JewelryDTO> getListDTO(List<Joya> list){
        List<JewelryDTO> listDTO= new ArrayList<>();
        for(Joya joya : list){
            listDTO.add(mapper.map(joya,JewelryDTO.class));
        }
        return listDTO;
    }
}
