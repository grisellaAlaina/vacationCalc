package com.example.vacationcalc;

import com.example.vacationcalc.services.CalcService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalcServiceTests {

    @Autowired
    private CalcService calcService;

    @Test
    public void testCalculateWithVacationDays() {

        double avgSalary = 35000;
        int vacationDays = 20;

        double result = calcService.calculate(avgSalary, vacationDays);

        assertEquals(23890.78, result, 0.01);
    }

    @Test
    public void testCalculateWithZeroVacationDays() {

        double avgSalary = 35000;
        int vacationDays = 0;

        double result = calcService.calculate(avgSalary, vacationDays);

        assertEquals(0.0, result, 0.01);
    }
}
