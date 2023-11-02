package com.spring.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public String ratingComments;

	public Review(String ratingComments) {
		super();
		this.ratingComments = ratingComments;
	}

	public Review() {
		super();
	}

	public String getRatingComments() {
		return ratingComments;
	}

	public void setRatingComments(String ratingComments) {
		this.ratingComments = ratingComments;
	}

	public int getId() {
		return id;
	}
	
	
}
