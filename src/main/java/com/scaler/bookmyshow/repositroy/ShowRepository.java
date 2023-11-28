package com.scaler.bookmyshow.repositroy;

import com.scaler.bookmyshow.models.Show;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Show, Long{
    @Override
    Optional<Show> findById(Long showId);

    @Override
    Show save(Show show);
}
