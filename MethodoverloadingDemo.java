package Com.acharya.classes;

public class MethodoverloadingDemo {

			public void display(int num)
		{
		  System.out.println(" The integer value ="+num);

		}
		public void display( char ch)
		{
			System.out.println("Character ="+ch);
		}
		public void display(String str)
		{
			System.out.println(" String ="+str);
		}
		public static void main(String [] args)
		{
			MethodoverloadingDemo obj= new MethodoverloadingDemo();
			obj.display(10);
			obj.display('A');
			obj.display("Ankitha");
			
			
		}
	}


	