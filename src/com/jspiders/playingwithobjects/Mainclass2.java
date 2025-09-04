package com.jspiders.playingwithobjects;

public class Mainclass2 {
	public static void main(String[] args) {
		Player p1 = Roaster.createPlayer();
		Roaster.displayPlayerDetails(p1);
		System.out.println("-------------");
		Player p2 = Roaster.createPlayer();
		Roaster.displayPlayerDetails(p2);
	}
}
