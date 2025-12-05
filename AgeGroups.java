package Com.acharya.classes;

import java.util.Scanner;

public class AgeGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Age");
		int Age = sc.nextInt();
		if (Age >= 0 && Age <= 12)
			System.out.println(Age + "this is kid age");
		else if (Age >= 13 && Age <= 19)
			System.out.println(Age + "this is teenager");
		else if (Age >= 20 && Age <= 40)
			System.out.println(Age + "this is youngster");
		else if (Age >= 40 && Age <= 55)
			System.out.println(Age + "this is aged man");
		else if (Age >= 55 && Age <= 70)
			System.out.println(Age + "this is old man");
		else
			System.out.println("Age is too older ");

	}

}
