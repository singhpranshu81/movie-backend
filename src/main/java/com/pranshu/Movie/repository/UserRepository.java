package com.pranshu.Movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pranshu.Movie.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	@Query("select e from User e where e.name like %:name%")
public User findbyName( @Param("name") String name);
}
