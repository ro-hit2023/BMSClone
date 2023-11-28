package com.scaler.bookmyshow.controller;

import com.scaler.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller// Controller which supports restAPI---> @RestController
// Controller which does't support restAPI use---> @Controller
public class userController {

    @Autowired
    private UserService userService;//this is an interface and according to the "dependency inversion principle" there should not be tight
    // coupling between two classes.


}
