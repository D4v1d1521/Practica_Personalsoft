package com.example.practica.Service;

import com.example.practica.Models.Autor;
import com.example.practica.Models.Libro;
import com.example.practica.Repository.AutorRepository;
import com.example.practica.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceAutor {

    @Autowired
    AutorRepository repository;

    @Autowired
    LibroRepository libroRepository;

    public Autor saveAutor(Autor autor){
        return repository.save(autor);
    }

    public Autor findById(Integer id){
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

    public List<Autor> findAll(){
        return repository.findAll();
    }

    public Autor asignar(Integer autor_id, Integer libros_id){
        List<Libro> listLibros = null;
        Autor autor = repository.findById(autor_id).get();
        Libro libro = libroRepository.findById(libros_id).get();
        listLibros = autor.getLibro();
        return repository.save(autor);
    }
}
