package com.scaler.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignupRequestDTO {
    private String name;
    private String email;
    private String password;
}
