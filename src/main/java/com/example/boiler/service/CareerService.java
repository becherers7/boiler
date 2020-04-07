package com.example.boiler.service;

import com.example.boiler.entity.Career;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CareerService {
    List<Career> findAllCareers();
}
