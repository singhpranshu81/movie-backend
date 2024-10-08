package com.pranshu.Movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranshu.Movie.entity.Ticket;
import com.pranshu.Movie.repository.TicketRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TicketServiceImpl implements TicketService{
    
	@Autowired
	private TicketRepository ticketRepository;
	  
	@Override
	public void createTicket(Ticket ticket) {
		ticketRepository.save(ticket);
		
	}

	@Override
	public List<Ticket> getAllTicket() {
		// TODO Auto-generated method stub
		return ticketRepository.findAll();
	}

	@Override
	public List<Ticket> deleteTicket(int id) {
		ticketRepository.deleteById(id);
		return getAllTicket();
	}

	@Override
	public Optional<Ticket> getTicketbyId(int id) {
		
		return ticketRepository.findById(id);
	}

}
