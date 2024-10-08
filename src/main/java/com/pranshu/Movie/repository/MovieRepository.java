package com.pranshu.Movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pranshu.Movie.entity.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

	@Query("select e from Movie e where e.movieName like %:movieName%")
public Movie findbyName( @Param("movieName") String name);
//	
//	@Query("select s.totalseats from Seat s where s.seatId = :seatID ")
//	public int getAllAvailableSeats(@Param("seatID") int seatID);
   

}
