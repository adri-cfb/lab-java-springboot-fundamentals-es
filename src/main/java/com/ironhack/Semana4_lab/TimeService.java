package com.ironhack.Semana4_lab;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;

@Service
public class TimeService {

    public String getCurrentTime() {
        return LocalTime.now().toString();
    }

    public String getCurrentDate() {
        return LocalDate.now().toString();
    }

    public String getDayOfWeek() {
        return DayOfWeek.from(LocalDate.now()).toString();
    }
}

