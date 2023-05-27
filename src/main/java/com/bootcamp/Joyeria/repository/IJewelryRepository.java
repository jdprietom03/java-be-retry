package com.bootcamp.Joyeria.repository;

import com.bootcamp.Joyeria.model.Joya;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IJewelryRepository extends JpaRepository<Joya,Integer> {
    public List<Joya> findByVentaONo(Boolean flag);
}
