package com.ironhack.Semana4_lab;

import org.springframework.web.bind.annotation.*;

@RestController
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getTime() {
        return "Current Time: " + timeService.getCurrentTime();
    }

    @GetMapping("/date")
    public String getDate() {
        return "Current Date: " + timeService.getCurrentDate();
    }

    @GetMapping("/day")
    public String getDay() {
        return "Day of the Week: " + timeService.getDayOfWeek();
    }

    @GetMapping("/all")
    public String getAllTimeData() {
        return "Time: " + timeService.getCurrentTime() + ", " +
                "Date: " + timeService.getCurrentDate() + ", " +
                "Day: " + timeService.getDayOfWeek();
    }
}