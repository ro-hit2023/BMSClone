package com.scaler.bookmyshow.repositroy;

import com.scaler.bookmyshow.models.Show;
import com.scaler.bookmyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
   @Override
    Optional<ShowSeat> findById(Long showSeatId);
   @Override
    ShowSeat save(ShowSeat showSeat);
}
