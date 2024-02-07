package com.example.demo.controller;

import com.example.demo.entiti.DataNasabah;
import com.example.demo.repository.DataNasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DataNasabahController {
    @Autowired
    DataNasabahRepository repository;
    @PostMapping("/nasabah")
    public ResponseEntity<String> createDataNasabah(@RequestBody DataNasabah dataNasabah) {
        try {
            DataNasabah create = new DataNasabah();
            create.setId(dataNasabah.getId());
            create.setNIK(dataNasabah.getNIK());
            create.setNoHp(dataNasabah.getNoHp());
            create.setEmail(dataNasabah.getEmail());
            create.setDOB(dataNasabah.getDOB());
            repository.save(dataNasabah);
            return ResponseEntity.ok("200 (sukses)");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("400 (Error client)");
        }
    }
    @GetMapping("/nasabah")
    public ResponseEntity<Map<String, List<DataNasabah>>> getNasabahList() {
        Map<String, List<DataNasabah>> items = new HashMap<>();
        List<DataNasabah> nasabahList = repository.findAll();
        items.put("nasabahList", nasabahList);
        return ResponseEntity.ok().body(items);
    }
}
