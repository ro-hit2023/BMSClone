package com.scaler.BookMyShow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Region extends BaseModel {

    private String name;

    @OneToMany // this will put id of Region on Theatre side
    private List<Theatre> theatre;

}
