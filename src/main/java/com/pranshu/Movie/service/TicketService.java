package com.pranshu.Movie.service;

import java.util.List;
import java.util.Optional;

import com.pranshu.Movie.entity.Movie;
import com.pranshu.Movie.entity.Ticket;

public interface TicketService {
	 public void createTicket(Ticket ticket);
	  public List<Ticket> getAllTicket();
	  public List<Ticket> deleteTicket(int id);
	  public Optional<Ticket> getTicketbyId(int id);
	
}
