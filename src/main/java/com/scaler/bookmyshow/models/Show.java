package com.scaler.bookmyshow.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity

public class Show extends BaseModel {
    private Movie movie;

    private Date StartTime;

    private Date endTime;

    private List<ShowSeat> showSeat;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection //maping table for show and features
    private List<Feature> features;

}
