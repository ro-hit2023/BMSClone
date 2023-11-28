package com.scaler.bookmyshow.repositroy;

import com.scaler.bookmyshow.models.SeatType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SeatTypeRepository extends JpaRepository<SeatType, Long> {
    @Override
    Optional<SeatType> findById(Long showId);
    @Override
    SeatType save(SeatType seatType);
}
