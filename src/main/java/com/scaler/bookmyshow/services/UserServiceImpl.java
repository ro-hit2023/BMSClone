package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.exception.InvalidCredentialException;
import com.scaler.bookmyshow.exception.UserAlreadyExistsException;
import com.scaler.bookmyshow.exception.UserNotFoundException;
import com.scaler.bookmyshow.repositroy.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    //why we have put UserRepositroy here
    //Because UserService object is dependent on UserRepositroy object.
    // every thing will be managed by spring boot throuch ioc container and
    // dependency management system
    //spring will create dependencies and it will inject them
    // use @Component annotation for dependent objects
    @Override
    public User login(String email, String password) {
        Optional<User> userOptional = userRepositroy.findByEmail(email);
        if(userOptional.isEmpty()){
            throw new UserNotFoundException("User with given email does not exist :" + email);
        }

        User user = userOptional.get();
        if(user.getPassword().equals(password)){
            return user;
        }
        else {
            throw new InvalidCredentialException("Credential are invalid");
        }
    }

    @Override
    public User signUp(String name, String email, String password) {
        Optional<User> userOptional = userRepositroy.findByEmail(email);
        if(userOptional.isPresent()){
            throw new UserAlreadyExistsException("User with given email is already present :" + email);
        }

        User newUser = new User();
        newUser.setPassword(password);
        newUser.setName(name);
        newUser.setEmail(email);
        return userRepository.save(newUser);
    }
}
