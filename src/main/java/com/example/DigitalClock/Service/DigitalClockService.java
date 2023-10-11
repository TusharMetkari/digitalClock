package com.example.DigitalClock.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DigitalClock.Entity.DigitalClock;
import com.example.DigitalClock.Repository.DigitalClockRepository;

@Service
public class DigitalClockService {
    @Autowired
    private DigitalClockRepository clockRepository;

    public DigitalClock getCurrentTime() {
        return clockRepository.getCurrentTime();
    }
}

