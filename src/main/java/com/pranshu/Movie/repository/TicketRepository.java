package com.pranshu.Movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pranshu.Movie.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {

	
}
