package com.scaler.bookmyshow.repositroy;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //this annotation will tell spring that this is a dependency and this must be injected some where
//@ Component can also be used
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long userId);
    // UserRepository is a subclass and JapRepository is superclass. @Override annotation indicates that a method in
    // superclass is  getting override by a method in subclass
    //here findById is a default method which is avalible for all objects so we have used @Override annotation

    Optional<User> findByEmail(String email);
    // here findByEmail is a user defined method so @override does not work
    //no need to inplement these methods jpa will take care of it

    Optional<User> findByEmailAndName(String email, String name);

    User save(User user);
}
