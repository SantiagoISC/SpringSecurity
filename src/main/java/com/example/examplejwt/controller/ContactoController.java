package com.example.examplejwt.controller;

import com.example.examplejwt.entity.ContactoEntity;
import com.example.examplejwt.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @GetMapping(value = "findAllContactos")
    public List<ContactoEntity> findAllContactos() {
        return contactoService.findAllContactos();
    }
}
