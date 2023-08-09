package com.pack.movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.movie.Repository.MovieRepository;
import com.pack.movie.entity.Movie;

@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	MovieRepository mRepo;
	
	
	@PostMapping("/movie")
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
		try {
			Movie savedMovie =mRepo.save(new Movie(movie.getName(),movie.getLanguage(),movie.getType(),movie.getRating()));
			return new ResponseEntity<>(savedMovie,HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
//	@GetMapping("/movie")
//	public 
}
