package Com.acharya.classes;

import java.util.Scanner;

public class OrOeratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int Number1;
          int Number2;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the Number 1");
          Number1=sc.nextInt();
          System.out.println("enter the Number 2");
          Number2=sc.nextInt();
          if(Number1==6 || Number2==6 ||Number1+Number2 == 6 ||Number1-Number2 == 6) 
        	 System.out.println("True") ;
        	 else {
        		 System.out.println("False") ;
        	 }
	}}
          
	


