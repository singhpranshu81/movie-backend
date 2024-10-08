package com.pranshu.Movie.service;

import java.util.List;
import java.util.Optional;

import com.pranshu.Movie.entity.Movie;

public interface MovieService {
	  public void createMovie(Movie movie);
	  public List<Movie> updateMovie(Movie movie);
	  public List<Movie> getAllMovie();
	  public List<Movie> deleteMovie(int id);
	  public Optional<Movie> getMoviebyId(int id);
	  public Movie getMoviebyName(String name);
	  public int getAvailableSeatsbyMovId(int id);
}
