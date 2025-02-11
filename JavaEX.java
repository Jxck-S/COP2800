import java.util.Scanner;
public class JavaEX {
	public static void main(String[] a) {
		float money = 33.3f; //Declare regular float
		double count = 45.34534; //Declaring a double type (large float)
		int dogs = 3; //Declare an integer
		int[] scores = {10, 20, 30, 40}; // Declare int single dimmen array
		String[] week = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"}; // String single dimm array
		tictactoe = new int[3][3]; // initilize a multi demm array
		final int MONTHS_IN_YEAR = 12; //Declare a final or constant  value cant be changed can be any data type
		System.out.println("Float " + money + " Double " + count + " Int " + dogs + " Final/Constant " + MONTHS_IN_YEAR);
		System.out.println("Int dog to float " + (float)dogs); //Convert datatype

		//INPUT
		Scanner stdin = new Scanner(System.in);
		count = stdin.nextDouble();
		System.out.println(count);
		/// If / else statement
		int age = 30;
		if ( age >= 65) {
			++seniorCitizens;
		}
		else if (age < 18) {
			++minor;
		}
		else {
			++nonSeniors;
		}
		/// Switch Statement
		int status = 200;
		switch (status) {
			case 200: System.out.println("OK (fulfilled)"); break;
			case 403: System.out.println("forbidden"); break;
			case 404: System.out.println("not found"); break;
			case 500: System.out.println("server error"); break;
			default: System.out.println("na"); break;
		}

		/// Conditional operator
		int x = 3;
		int y = 2;
		// x if x > y else y
		System.out.println((x > y) ? x : y);

		// continue or break keywords can be used in loops, break also can be used in switch
		// break will end a loop, contiue will jump to next iteration
		// for loop
		int total = 0;
		int k;
		for (k = 1; k <= 50; k++) {
			total += (k*k);
		}

		// while loop
		int last;
		int n;
		int dupes = 0;
		while (n > 0) {
			if (n == last){
				dupes++;
			}
			last = n;
			n = stdin.nextInt();
		}

		// do while loop
		k = 0;
		do {
			System.out.print("*");
			k++;
		} while (k < 53);

	}
// define a method
//          int- return type  twice- method name (inputs)
public static int twice(int inint){
	return inint * 2;
}
}
