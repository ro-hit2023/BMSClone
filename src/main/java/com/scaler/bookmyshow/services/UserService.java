package com.scaler.bookmyshow.services;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User login(String email, String password);

    User signUp(String name, String email, String password);

}
//Every business locgic will come inside service layer
