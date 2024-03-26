package com.example.vacationcalc.controllers;


import com.example.vacationcalc.services.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {

    private final CalcService calcService;

    @Autowired
    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }


    @GetMapping()
    public double calculateVacationPay(@RequestParam double avgSalary, @RequestParam int vacationDays) {
        return calcService.calculate(avgSalary, vacationDays);
    }
}
