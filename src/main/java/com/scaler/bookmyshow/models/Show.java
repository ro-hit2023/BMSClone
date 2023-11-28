package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity

public class Show extends BaseModel {
    @ManyToOne
    private Movie movie;

    private Date StartTime;

    private Date endTime;
    @OneToMany
    private List<ShowSeat> showSeat;
    @ManyToOne
    private Screen screen;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection //maping table for show and features
    private List<Feature> features;

}
