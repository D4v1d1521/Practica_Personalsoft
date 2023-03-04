package com.example.practica.Repository;

import com.example.practica.Models.Autor;
import com.example.practica.Models.Editorial;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EditorialRepository extends CrudRepository<Editorial, Integer> {

    @Query(value = "SELECT * FROM editorial WHERE nombre LIKE '?%'", nativeQuery = true)
    public List<Editorial> findByNombre(String nombre);

    List<Editorial> findAll();
}
