package com.example.practica.Repository;

import com.example.practica.Models.Autor;
import com.example.practica.Models.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

    List<Categoria> findAll();
}
