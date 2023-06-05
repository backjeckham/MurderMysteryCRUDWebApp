package net.murdermystery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "murder_mystery_box_set")
public class MurderMysteryBoxSet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "murder_mystery_title")
	private String murderMysteryTitle;
	
	@Column(name = "difficulty_rating")
	private String difficultyRating;
	
	@Column(name = "creativity_rating")
	private String creativityRating;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "user_review")
	private String userReview;
	
	/**
	 * Retrieves the ID of the murder mystery box set.
	 * 
	 * @return The ID of the murder mystery box set.
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Sets the ID of the murder mystery box set.
	 * 
	 * @param id The ID of the murder mystery box set.
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * Retrieves the title of the murder mystery.
	 * 
	 * @return The title of the murder mystery.
	 */
	public String getMurderMysteryTitle() {
		return murderMysteryTitle;
	}
	
	/**
	 * Sets the title of the murder mystery.
	 * 
	 * @param murderMysteryTitle The title of the murder mystery.
	 */
	public void setMurderMysteryTitle(String murderMysteryTitle) {
		this.murderMysteryTitle = murderMysteryTitle;
	}
	
	/**
	 * Retrieves the difficulty rating of the murder mystery.
	 * 
	 * @return The difficulty rating of the murder mystery.
	 */
	public String getDifficultyRating() {
		return difficultyRating;
	}
	
	/**
	 * Sets the difficulty rating of the murder mystery.
	 * 
	 * @param difficultyRating The difficulty rating of the murder mystery.
	 */
	public void setDifficultyRating(String difficultyRating) {
		this.difficultyRating = difficultyRating;
	}
	
	/**
	 * Retrieves the creativity rating of the murder mystery.
	 * 
	 * @return The creativity rating of the murder mystery.
	 */
	public String getCreativityRating() {
		return creativityRating;
	}
	
	/**
	 * Sets the creativity rating of the murder mystery.
	 * 
	 * @param creativityRating The creativity rating of the murder mystery.
	 */
	public void setCreativityRating(String creativityRating) {
		this.creativityRating = creativityRating;
	}
	
	/**
	 * Retrieves the price of the murder mystery box set.
	 * 
	 * @return The price of the murder mystery box set.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Sets the price of the murder mystery box set.
	 * 
	 * @param price The price of the murder mystery box set.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Retrieves the user review of the murder mystery box set.
	 * 
	 * @return The user review of the murder mystery box set.
	 */
	public String getUserReview() {
		return userReview;
	}
	
	/**
	 * Sets the user review of the murder mystery box set.
	 * 
	 * @param userReview The user review of the murder mystery box set.
	 */
	public void setUserReview(String userReview) {
		this.userReview = userReview;
	}
	
	
	

}