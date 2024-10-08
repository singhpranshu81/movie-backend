package com.pranshu.Movie.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pranshu.Movie.entity.Ticket;
import com.pranshu.Movie.service.TicketService;

@RestController
@RequestMapping("/Movie/ticket")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*",
origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.PUT,RequestMethod.DELETE} )
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	@PostMapping("/addticket")
    public void createticket(@RequestBody Ticket ticket) {
		
		ticketService.createTicket(ticket);
    }
	
	
	@GetMapping("/listalltickets")
	public ResponseEntity<List<Ticket>> listAlltickets() {
		List<Ticket> ticketlist = ticketService.getAllTicket();
		return ResponseEntity.ok(ticketlist);
	}
	
	
	@DeleteMapping("/deleteticket/{tid}")
	public ResponseEntity<String> deleteticket(@PathVariable int tid) {
		ticketService.deleteTicket(tid);
		return ResponseEntity.ok("Ticket " + tid + " Deleted ...");

	}
	
	@GetMapping("/findticket/{tid}")
	public ResponseEntity<Optional<Ticket>> findticketById(@PathVariable int tid) {
		Optional<Ticket> tick = ticketService.getTicketbyId(tid);
		return ResponseEntity.ok(tick);
	}
	
	
}
