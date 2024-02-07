package com.example.demo.entiti;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Data_Nasabah")
public class DataNasabah implements Serializable {

    @Id
    @Column(name = "nama")
    @JsonProperty("nama")
    private String id;
    @Column(name = "NIK")
    private String NIK;
    private Long noHp;
    private String email;
    private Long DOB;

}
