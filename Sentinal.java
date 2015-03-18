import java.util.Scanner;


public class Sentinal {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.print("Type a number (or –1 to stop): ");
		int num = s.nextInt();
		while(num != -1) {
			System.out.print("Type a number (or –1 to stop): ");
			 num = s.nextInt();
			if(num > max && num !=-1) {
				max = num;
			}
			if(num < min && num !=-1) {
				min=num;
			}
			
		}

		System.out.println("Maximum was "+ max);
		System.out.println("Minimum was "+ min);
	}
}
