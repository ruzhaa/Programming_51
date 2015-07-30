package com.hackbulgaria.programming51.week6;

import java.util.Scanner;

public class LabirintMain {

	public static void main(String[] args) {
		Labirinth l = new Labirinth();
		Scanner scanner = new Scanner(System.in);
		String direction;
		while(!l.isCompleted()) {
			System.out.println(l);
			System.out.println("Make your move: ");
			direction = scanner.next();
			
			switch(direction) {
				case "up" : l.movePerson(new MoveUp()); break;
				case "down" : l.movePerson(new MoveDown()); break;
				case "left" : l.movePerson(new MoveLeft()); break;
				case "right" : l.movePerson(new MoveRight()); break;
			}
		}
		System.out.println(l);
		System.out.println("Congratulations!");

	}
}
