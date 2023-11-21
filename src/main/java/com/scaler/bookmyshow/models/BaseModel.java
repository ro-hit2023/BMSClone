package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {

    @Id // this annotation comes from jap that reads all the attributes and converts them into columns
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; //@Id will tell jpa that this attribute will be my primary key

    @CreatedDate // this annotation will make this column audit column

    private Date createdAt;//This is a time stamp
    @Temporal(value = TemporalType.TIMESTAMP)
    @LastModifiedDate // this annotation will make this column audit column
    @Temporal(value = TemporalType.TIMESTAMP)
    private  Date updatedAt;//This is a time stamp

}
