package com.example.examplejwt.service;

import com.example.examplejwt.entity.ContactoEntity;
import com.example.examplejwt.repositories.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService {

    @Autowired
    private ContactoRepository contactoRepository;

    public List<ContactoEntity> findAllContactos() {
        return contactoRepository.findAll();
    }
}
