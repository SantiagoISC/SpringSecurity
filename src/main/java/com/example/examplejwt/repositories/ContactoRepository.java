package com.example.examplejwt.repositories;

import com.example.examplejwt.entity.ContactoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<ContactoEntity, Integer> {
}
