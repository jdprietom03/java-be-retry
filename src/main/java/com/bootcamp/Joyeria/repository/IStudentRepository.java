package com.bootcamp.Joyeria.repository;

import com.bootcamp.Joyeria.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student,Integer> {
}
