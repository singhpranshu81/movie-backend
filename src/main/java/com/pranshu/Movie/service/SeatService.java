package com.pranshu.Movie.service;

import java.util.Optional;

import com.pranshu.Movie.entity.Seat;

public interface SeatService {
	public Optional<Seat> getSeatbyId(int id);
	
}
