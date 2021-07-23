package com.javaex.oop.goods.v3;

public class SongClass {
	//	필드 선언
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	//	생성자 규칙
	public SongClass(String title, String artist, String album,
			String composer, int year, String track) {
		setAlbum(album);
		setArtist(artist);
		setComposer(composer);
		setTitle(title);
		setTrack(track);
		setYear(year);
		
		}
	//	getter
	public String getTitle() {
		return title;
	}	
	public String getArtist() {
		return artist;
		}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public String getTrack() {
		return track;
	}
	
	//	setter
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	
	//	메서드
	public void showInfo() {
		System.out.printf("%s, %s ( %s, %d, %s, %s)%n",
				artist,title,album,year,composer,track);
		
	}
}
