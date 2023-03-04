package com.example.practica.Repository;

import com.example.practica.Models.Autor;
import com.example.practica.Models.Libro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibroRepository extends CrudRepository<Libro, Integer> {

    @Query(value = "select * from libros where titulo = ?", nativeQuery = true)
    public List<Libro> findByNombre(String titulo);

    List<Libro> findAll();


}
