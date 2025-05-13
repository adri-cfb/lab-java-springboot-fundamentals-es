package com.ironhack.Semana4_lab;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public String getTemperature() {
        return "Temperature: " + weatherService.getCurrentTemperature() + "°C";
    }

    @GetMapping("/condition")
    public String getCondition() {
        return "Condition: " + weatherService.getWeatherCondition();
    }

    @GetMapping("/wind")
    public String getWindSpeed() {
        return "Wind speed: " + weatherService.getWindSpeed() + " km/h";
    }

    @GetMapping("/all")
    public String getAllWeather() {
        return "Temperature: " + weatherService.getCurrentTemperature() + "°C, " +
                "Condition: " + weatherService.getWeatherCondition() + ", " +
                "Wind speed: " + weatherService.getWindSpeed() + " km/h";
    }
}
