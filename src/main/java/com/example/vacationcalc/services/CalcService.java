package com.example.vacationcalc.services;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public double calculate(double avgSalary, int vacationDays) {
       double result = avgSalary / 29.3 * vacationDays;
       return Math.round(result * 100.0) / 100.0;
    }
}
