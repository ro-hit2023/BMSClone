package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity

public class Screen extends BaseModel{
    private String name;

    @OneToMany
    private List<Seat> seats;

    @Enumerated(EnumType.ORDINAL) // IN CASE OF ENUM WE CAN'T USE @OneToMany annotation so we use @Enumerated annotation
    @ElementCollection //mapping table for scree to features
    private List<Feature> Features;
}
