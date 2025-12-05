package Com.acharya.classes;
import java.util.Scanner;
public class ArrayUsingLoops {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

       
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == 1 && arr[i + 1] == 2 && arr[i + 2] == 3) {
                found = true;
                break;
            }
        }

        System.out.println("Sequence 1,2,3 found: " + found);
    }
}