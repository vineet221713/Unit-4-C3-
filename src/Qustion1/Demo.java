package Qustion1;

public class Demo {
	public static void main(String[] args) {
		try {
			
			int[] arr = new int[2];
			arr[0] = 50;
			arr[1] = 80;
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[9]);
			
			
		}
		catch(ArrayIndexOutOfBoundsException ae){
			
		System.out.println(ae);
		}
		
		catch(NumberFormatException ae) {
			System.out.println(ae);
		}
		
	}

}
