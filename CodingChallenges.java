package codingChallenges;

import java.util.*;

public class CodingChallenges {
}

class ChallengeOne{
	public static void main(String... args){

		System.out.print("Please enter a single, positive integer: ");
		Scanner in = new Scanner(System.in);
		try{
			int minutes = in.nextInt();
			if(minutes < 0) throw new InputMismatchException();
			
			System.out.println(minutes + " minutes -> " + minutesToSeconds(minutes) + " seconds");
		} catch(InputMismatchException e){
			System.out.println("Invalid argument. Must be  a single, positive integer.");
		}


	}

	static int minutesToSeconds(int minutes){
		return minutes * 60;
	}
}

