package main;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		System.out.println("Spark will change your life! -by Finique");
		gameLoop();
	}

	private static void gameLoop() {

		while (true) {
			
			System.out.println("Will you change the world?");
			Scanner input = new Scanner(System.in);
			String answer = input.next();
			input.close();
			if (answer.equals("yes")) {
				
				System.out.println("You win!");
			}
			else {
				
				System.out.println("Game Over");
			}
			break;
		}
	}
}