package com.scaler.BookMyShow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignUpRequestDTO {
    private String name;
    private String email;
    private String password;
}
// for input output of controller we don't use models directly
// we use dto