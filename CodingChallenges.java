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
			in.close();

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

class ChallengeTwo{
	
	public List<Integer> list = new ArrayList<>();	

	public static void main(String... args) {
		
		Scanner in = new Scanner(System.in);
		try{
			System.out.print("Please enter a single positive integer: ");
			int n = in.nextInt();
			System.out.print("Please enter the number of multiples desired: ");
			int max = in.nextInt();
			in.close();

			if(n < 0 || max < 0) throw new InputMismatchException();
			
			System.out.println("Multiples of " + n + ": " + arrayOfMultiple(n, max));
		} catch(InputMismatchException e){
			System.out.println("Invalid argument. Must be  a single, positive integer.");
		}
	}

	static List<Integer> arrayOfMultiple(int n, int max) {
		List<Integer> multiples = new ArrayList<>();
		
		for(int i = 1; i <= max; i++) {
			multiples.add(n * i);
		}

		return multiples;
		 	
	}
}

