package com.example.examplejwt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(schema = "bdjwt", name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioEntity {
    @Id
    @Column(name = "idusuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String email;
    private String password;
}
