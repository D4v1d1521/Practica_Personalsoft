package com.example.practica.Controller;

import com.example.practica.Models.Editorial;

import com.example.practica.Service.ServiceEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/editorial/")
public class EditorialController {

    @Autowired
    ServiceEditorial service;

    @PostMapping("save")
    public Editorial saveEditorial(@RequestBody Editorial editorial){
        return service.SaveEditorial(editorial);
    }

    @GetMapping("findById")
    public Editorial findById(Integer id){
        return service.findbyId(id);
    }

    @GetMapping("buscarId")
    public boolean buscarId(Integer id){
        return service.buscarId(id);
    }

    @DeleteMapping("deleteById")
    public boolean deleteById(Integer id){
        return service.deleteById(id);
    }

    @GetMapping("findByNombre")
    public List<Editorial> findByNombre(String nombre){
        return service.findByNombre(nombre);
    }


    @GetMapping("findAll")
    public List<Editorial> findAll(){
        return service.findAll();
    }


}
