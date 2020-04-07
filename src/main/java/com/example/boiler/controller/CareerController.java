package com.example.boiler.controller;

import com.example.boiler.entity.Career;
import com.example.boiler.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/careers")
public class CareerController {

    @Autowired
    CareerService careerService;

    @GetMapping("")
    ResponseEntity<List<Career>> findAllCareers() {
        return ResponseEntity.ok(careerService.findAllCareers());
    }
}
