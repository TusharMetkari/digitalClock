package com.example.DigitalClock.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DigitalClock.Entity.DigitalClock;
import com.example.DigitalClock.Service.DigitalClockService;

@RestController
public class DigitalClockController {
    @Autowired
    private DigitalClockService clockService;

    @GetMapping("/current-time")
    public Date getCurrentTime() {
        DigitalClock digitalClock = clockService.getCurrentTime();
        return digitalClock.getCurrentTime();
    }
}

