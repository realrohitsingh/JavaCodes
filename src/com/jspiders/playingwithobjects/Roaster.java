package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class Roaster {
	static void displayPlayerDetails(Player p) {
		if(p!=null) {
			System.out.println("Jersey Number : "+p.jerseyNumber);
			System.out.println("Player Name : "+p.name);
		}
	}
	static Player createPlayer() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Jersey Number");
		int jerseyNumber=scn.nextInt();
		System.out.println("Enter Player Name");
		String name=scn.next();
		Player p=new Player(jerseyNumber,name);
		return p;
	}
}
