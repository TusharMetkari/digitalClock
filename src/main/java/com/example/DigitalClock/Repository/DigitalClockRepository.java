package com.example.DigitalClock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DigitalClock.Entity.DigitalClock;

@Repository
public interface DigitalClockRepository extends JpaRepository<DigitalClock, Integer> {
    DigitalClock getCurrentTime();
}

