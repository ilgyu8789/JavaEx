package com.javaex.oop.goods.v3;

public class SongClassApp {

	public static void main(String[] args) {
		SongClass a = new SongClass(
				"아이유",	"좋은날", "Real", "이민수", 2010, "3번 track");
		a.showInfo();
		
		SongClass b = new SongClass(
				"BICBANG", "거짓말", "Always", "G-DRAGON", 2007, "2번 track");
		b.showInfo();
		
		SongClass c = new SongClass(
				"버스커버스커",	"벚꽃엔딩", "Real", "장범준", 2012, "4번 track");
		c.showInfo();
	}

}




//artist,title,album,year,composer,track