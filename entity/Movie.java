package com.pack.movie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="mov1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String language;
	private String type;
	private Integer rating;
	public Movie(String name, String language, String type, Integer rating) {
		super();

		this.name = name;
		this.language = language;
		this.type = type;
		this.rating = rating;
	}
	
	
}

