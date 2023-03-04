package com.example.practica.Controller;

import com.example.practica.Models.InfoAdicional;
import com.example.practica.Service.ServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/info/")
public class InfoController {

    @Autowired
    ServiceInfo service;

    @PostMapping("save")
    public InfoAdicional saveInfo(@RequestBody InfoAdicional info){
        return service.saveInfo(info);
    }

    @GetMapping("findById")
    public InfoAdicional findById(Integer id){
        return service.findById(id);
    }

    @GetMapping("buscarId")
    public boolean buscarId(Integer id){
        return service.buscarId(id);
    }

    @DeleteMapping("deleteById")
    public boolean deleteById(Integer id){
        return service.deleteById(id);
    }

    @GetMapping("findAll")
    public List<InfoAdicional> findAll(){
        return service.findAll();
    }
}
