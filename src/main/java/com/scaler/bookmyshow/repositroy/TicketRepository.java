package com.scaler.bookmyshow.repositroy;

import com.scaler.bookmyshow.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Override
    Optional<Ticket> findById(Long ticketId); //we dont have to write logic for findById or save japrepository will take care of it
    //this Optional is a place holder it will either return the result or it will be empty. If the ticket is not present in the repository it will not give a null value
    // this Optional will avoid null point exception
    @Override
    Ticket save(Ticket ticket);


}
