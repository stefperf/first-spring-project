package com.example.springproject.exercises.exercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private final DataService dataService;

    @Autowired
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
