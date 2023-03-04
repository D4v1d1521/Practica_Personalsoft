package com.example.practica.Repository;

import com.example.practica.Models.Autor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Integer> {

    List<Autor> findAll();
}
