package com.example.demo.entiti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Data_Nasabah")
public class DataNasabah {

    @Id
    @Column(name = "nama")
    private String id;
    @Column(name = "NIK")
    private String NIK;
    private Long noHp;
    private String email;
    private Long DOB;
}
