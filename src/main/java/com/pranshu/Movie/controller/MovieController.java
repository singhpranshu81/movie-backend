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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pranshu.Movie.entity.Movie;
 import com.pranshu.Movie.service.MovieService;

@RestController
@RequestMapping("/Movie/movie")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*",
origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.PUT,RequestMethod.DELETE} )
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	@PostMapping("/addmovie")
    public void createmovie(@RequestBody Movie movie) {
		
          movieService.createMovie(movie);
    }
	
	
	@GetMapping("/listallmovies")
	public ResponseEntity<List<Movie>> listAllmovies() {
		List<Movie> movielist = movieService.getAllMovie();
		return ResponseEntity.ok(movielist);
	}
	
	
	@PutMapping("/updatemovie")
	public ResponseEntity<List<Movie>> updatemovie(@RequestBody Movie movie) {
		List<Movie> updatedmovie = movieService.updateMovie(movie);
		return ResponseEntity.ok(updatedmovie);
	}

	@DeleteMapping("/deletemovie/{mid}")
	public ResponseEntity<String> deletemovie(@PathVariable int mid) {
		movieService.deleteMovie(mid);
		return ResponseEntity.ok("movie " + mid + " Deleted ...");

	}
	
	@GetMapping("/findmovie/{mid}")
	public ResponseEntity<Optional<Movie>> findmovieById(@PathVariable int mid) {
		Optional<Movie> mv = movieService.getMoviebyId(mid);
		return ResponseEntity.ok(mv);
	}

 	@GetMapping("/findmoviebyname/{name}")
	public ResponseEntity<Movie> getmovieByName(@PathVariable String name) {
 		Movie m = movieService.getMoviebyName(name);
		return ResponseEntity.ok(m);
	}
 	
//	@GetMapping("/findseatsbymovid/{mid}")
//	public ResponseEntity<Integer> findavaseatsBymovId(@PathVariable int mid) {
//	 int x=movieService.getAvailableSeatsbyMovId(mid);
//	 return ResponseEntity.ok(x);
//	}
}
