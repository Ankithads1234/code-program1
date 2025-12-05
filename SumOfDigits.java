package Com.acharya.classes;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		int sum=0;
		while (number > 0) {
			int digit = number % 10;
			sum = sum + digit;
			number = number / 10;
			

		}
		System.out.println("sum of digit is "+sum);

	}
}
