package com.uern.poo.ranking.ranking.game;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Game {
	
	@Id
	@SequenceGenerator (
		name = "game_sequence",
		sequenceName = "game_sequence",
		allocationSize = 1
	)
	@GeneratedValue (
		strategy = GenerationType.SEQUENCE,
		generator = "game_sequence"
	)
	private long id;
	private String name;
	private String description;
	private String urlPhoto;
	private String rating;
	private String tecs;
		
	
	public Game() {
		
	}

	public Game(long id, String name, String description, String urlPhoto, String rating, String tecs) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.urlPhoto = urlPhoto;
		this.rating = rating;
		this.tecs = tecs;
	}

	public Game(String name, String description, String urlPhoto, String rating, String tecs) {

		this.name = name;
		this.description = description;
		this.urlPhoto = urlPhoto;
		this.rating = rating;
		this.tecs = tecs;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public void setTecs(String tecs) {
		this.tecs = tecs;
	}
	
	public String getTecs() {
		return tecs;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + 
				", name=" + name + 
				", description=" + description + 
				", urlPhoto=" + urlPhoto + 
				", rating=" + rating + 
				", tecs= " + tecs + "]";
	}
		
}
