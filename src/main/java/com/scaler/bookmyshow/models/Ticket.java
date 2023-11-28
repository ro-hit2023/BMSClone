package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    @ManyToOne
    private Show show;// Many tickets for only one ticket
    @OneToMany
    private List<Payment> payments;

    @ManyToOne
    private User user; //one user can book  many tickets

    @ManyToMany
    private List<ShowSeat> showSeats; // 1 Ticket -> many showseats 1:M

    private Date bookedAt;

    private int amount;

}
