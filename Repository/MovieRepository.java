package com.pack.movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.movie.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {

}
