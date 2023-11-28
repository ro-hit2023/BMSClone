package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Description;

import javax.lang.model.element.Name;

@Getter
@Setter
@Entity

public class Movie extends BaseModel {
    private String name;
    private String description;
    private String posterLink;
}
