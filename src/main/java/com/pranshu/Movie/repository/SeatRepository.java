package com.pranshu.Movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.pranshu.Movie.entity.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer>{

}
