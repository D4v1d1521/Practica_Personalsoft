package com.example.practica.Repository;

import com.example.practica.Models.Autor;
import com.example.practica.Models.InfoAdicional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoRepository extends CrudRepository<InfoAdicional, Integer> {

    List<InfoAdicional> findAll();
}
