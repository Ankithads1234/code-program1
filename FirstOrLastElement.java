package Com.acharya.classes;

public class FirstOrLastElement {

public static void main(String[] args) {
        
        int[] arr = {6, 2, 3, 4};  
        
        
        if (arr.length >= 1) {

           
            if (arr[0] == 6 || arr[arr.length - 1] == 6) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        } else {
            System.out.println("Array length is less than 1");
        }
    }
}
