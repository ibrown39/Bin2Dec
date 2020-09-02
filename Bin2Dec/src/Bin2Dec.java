//	Binary is the number system all digital computers are based on. Therefore it's important for developers to understand binary, or base 2, mathematics. 
//  The purpose of Bin2Dec is to provide practice and understanding of how binary calculations.
//
//	Bin2Dec allows the user to enter strings of up to 8 binary digits, 0's and 1's, in any sequence and then displays its decimal equivalent.
//
//	This challenge requires that the developer implementing it follow these constraints:
//
//	Arrays may not be used to contain the binary digits entered by the user
//	Determining the decimal equivalent of a particular binary digit in the sequence must be calculated using a single mathematical function, 
//	for example the natural logarithm. It's up to you to figure out which function to use.

//	Ian Brown

import java.util.*;
public class Bin2Dec { //Bin2Dec	Binary-to-Decimal number converter	1-Beginner
	
	public static String input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a binary number (0s and/or 1s) that is not longer than 8 digits: ");
		String userInput = s.nextLine();
		return userInput;
	}
	
	public static double convert() {
		String input = input();
		double sum = 0;
		for (int i = input.length()-1; i>-1;) {
			for (int j = 0; j<input.length(); j++) {
				char c = input.charAt(j);
				int decimalC = Character.getNumericValue(c);
				System.out.println("i = "+i);
				System.out.println("j = "+j);
				System.out.println(decimalC+"*"+Math.pow(2, i)+" = "+decimalC*Math.pow(2, i));
				sum += decimalC*Math.pow(2, i);
				i--;
				System.out.println("Sum: "+sum);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Bin2Dec.convert());
		
	}
}
