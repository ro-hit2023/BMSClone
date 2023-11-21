package com.scaler.bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Region extends BaseModel {
    private String name;

    @OneToMany // this will put id of Region on Theatre side
    private List<Theatre> theatre;

}
