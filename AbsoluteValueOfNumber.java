package Com.acharya.classes;
import java.util.Scanner;
public class AbsoluteValueOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int Number;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number");
         Number=sc.nextInt();
         if(Number<0) {
        	 Number=-Number;
        	 System.out.println("Absolute value of number="+Number);
        	 
         }
         
	}

}
