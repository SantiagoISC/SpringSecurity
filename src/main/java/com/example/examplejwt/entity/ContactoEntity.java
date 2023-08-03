package com.example.examplejwt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(schema = "bdjwt", name = "contacto")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactoEntity {
    @Id
    @Column(name = "idcontacto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @Column(name = "fechanacimiento")
    private LocalDate fechaNacimiento;
    private String celular;
    private String email;
}
