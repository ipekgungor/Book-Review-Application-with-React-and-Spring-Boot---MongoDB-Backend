package com.example.reviews.Model;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private ObjectId id;
    private String grId;
    private String title;
    private String author;
    private String genre;
    private String poster;
    private List<String> backdrops;
    
    @DBRef
    private List<Review> reviews;

    
	public Book(String grId, String title, String author, String genre, String poster,
			List<String> backdrops, List<Review> reviews) {
		this.grId = grId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.poster = poster;
		this.backdrops = backdrops;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getGrId() {
		return grId;
	}

	public void setGrId(String grId) {
		this.grId = grId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public List<String> getBackdrops() {
		return backdrops;
	}

	public void setBackdrops(List<String> backdrops) {
		this.backdrops = backdrops;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
    	
}
