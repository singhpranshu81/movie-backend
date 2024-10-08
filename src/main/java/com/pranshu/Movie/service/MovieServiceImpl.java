package com.pranshu.Movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranshu.Movie.entity.Movie;
import com.pranshu.Movie.repository.MovieRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieRepository movieRepository;
	 
	@Override
	public void createMovie(Movie movie) {
		movieRepository.save(movie);
		
	}

	@Override
	public List<Movie> updateMovie(Movie movie) {
		movieRepository.save(movie);
		return getAllMovie();
	}

	@Override
	public List<Movie> getAllMovie() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	@Override
	public List<Movie> deleteMovie(int id) {
		movieRepository.deleteById(id);
		return getAllMovie();
	}

	@Override
	public Optional<Movie> getMoviebyId(int id) {
		// TODO Auto-generated method stub
		return movieRepository.findById(id);
	}

	@Override
	public Movie getMoviebyName(String name) {
		// TODO Auto-generated method stub
		return movieRepository.findbyName(name);
	}

	@Override
	public int getAvailableSeatsbyMovId(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
