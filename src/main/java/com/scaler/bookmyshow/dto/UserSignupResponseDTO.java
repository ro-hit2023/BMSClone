package com.scaler.bookmyshow.dto;

import com.scaler.bookmyshow.models.Ticket;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserSignupResponseDTO {

    private Long id;
    private String name;
    private String email;
    private List<Ticket> tickets; //TODO : change ticket to TicketResponseDTO
}
