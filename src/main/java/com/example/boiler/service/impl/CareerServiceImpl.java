package com.example.boiler.service.impl;

import com.example.boiler.entity.Career;
import com.example.boiler.repository.CareerRepository;
import com.example.boiler.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerServiceImpl implements CareerService {
    @Autowired
    CareerRepository careerRepository;

    public List<Career> findAllCareers() {
        return careerRepository.findAll();
    }


}
