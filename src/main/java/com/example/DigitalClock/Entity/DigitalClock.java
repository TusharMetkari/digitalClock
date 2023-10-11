package com.example.DigitalClock.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Digitalclock")
public class DigitalClock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    private Date currentTime;

	public DigitalClock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DigitalClock(int id, Date currentTime) {
		super();
		this.id = id;
		this.currentTime = currentTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	@Override
	public String toString() {
		return "DigitalClock [id=" + id + ", currentTime=" + currentTime + "]";
	}

    
}

