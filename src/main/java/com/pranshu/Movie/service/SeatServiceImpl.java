package com.pranshu.Movie.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranshu.Movie.entity.Seat;
import com.pranshu.Movie.repository.SeatRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SeatServiceImpl implements SeatService  {
   @Autowired
	private SeatRepository seatRepository;
	@Override
	public Optional<Seat> getSeatbyId(int id) {
		Optional<Seat> s =seatRepository.findById(id);
		return s;
	}

}
