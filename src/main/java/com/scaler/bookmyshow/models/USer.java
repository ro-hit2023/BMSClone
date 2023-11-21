package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class USer extends BaseModel {
    private  String name;

    private String email;

    @OneToMany
    private List<Ticket> tickets;

}
