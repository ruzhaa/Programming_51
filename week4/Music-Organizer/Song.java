package com.hackbulgaria.programming51.week4;

public class Song {
	private String name = "";
	private String artist = "";
	private double duration = 0;
	private String album = "";

	public Song(String name, String artist) {
		this.name = name;
		this.artist = artist;
	}

	public Song(String name, String artist, double duration) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}

	public Song(String name, String artist, double duration, String album) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		this.album = album;
	}

	public String getAlbum() {
		return album;
	}

	public String toString() {
		return "Name:" + name + ", Artist:" + artist + ", Duration:" + duration
				+ ", Album:" + album;
	}
}
