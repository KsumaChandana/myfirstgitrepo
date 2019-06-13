package com.example.league;

public class League {
	private String title;
	private String season;
	private int year;
	public League(int year, String season, String title) {
		super();
		this.title = title;
		this.season = season;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "League [title=" + title + ", season=" + season + ", year=" + year + "]";
	}

}
