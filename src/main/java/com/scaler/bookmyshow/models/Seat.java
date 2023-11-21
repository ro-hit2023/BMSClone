package com.scaler.bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private int rowVal;
    private int calVal;
    private String seatNumber;
    @ManyToOne
    private SeatType seatType;
}

// 100 seats
//vip, gold and silver
//vip = 20 seats
//gold = 50
// silver = 30
