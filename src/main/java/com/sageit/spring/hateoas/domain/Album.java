package com.sageit.spring.hateoas.domain;

public class Album {
	
	private final String id;
	private final String title;
	private final String artist;
	private int stockLevel;

	public Album(final String id, final String title, final String artist, int stockLevel) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.stockLevel = stockLevel;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public int getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}
}