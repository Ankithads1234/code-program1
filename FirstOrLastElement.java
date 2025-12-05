package Com.acharya.classes;

public class FirstOrLastElement {

	public static void main(String[] args) {

        int[] arr = {6, 3, 4, 5};   

        
        if (arr.length >= 1) {

           
            boolean result = (arr[0] == 6 || arr[arr.length - 1] == 6);

            System.out.println(result);

        } else {
            System.out.println("Array length must be 1 or more");
        }
    }
}