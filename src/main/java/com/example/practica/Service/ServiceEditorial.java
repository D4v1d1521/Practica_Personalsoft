package com.example.practica.Service;

import com.example.practica.Models.Autor;
import com.example.practica.Models.Editorial;
import com.example.practica.Models.Libro;
import com.example.practica.Repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEditorial {

    @Autowired
    EditorialRepository repository;

    public Editorial SaveEditorial(Editorial editorial){
        return repository.save(editorial);
    }

    public Editorial findbyId(Integer id){
        return repository.findById(id).orElse(null);
    }

    public boolean buscarId(Integer id){
        if(repository.findById(id).isPresent()){
            return true;
        }else {
            return false;
        }

    }

    public boolean deleteById(Integer id){
        try {
            repository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public List<Editorial> findByNombre(String nombre){
        return repository.findByNombre(nombre);
    }

    public List<Editorial> findAll(){
        return repository.findAll();
    }
}
