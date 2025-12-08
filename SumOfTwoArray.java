package Com.acharya.classes;
import java.util.Scanner;
public class SumOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int arr[][]= {{15,6,4,9},
            		{14,23,13,15},
            		{15,16,6,8}};
            int sum=0;
            for (int i=0;i<arr.length;i++)
            	for(int j=0;j<arr[i].length;j++) 
            		sum+=arr[i][j];
            		System.out.println("sum of the array elements"+sum);
            	}
            
            
	

}
