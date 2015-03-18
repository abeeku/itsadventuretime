import java.util.Scanner;


public class SmallestLargest {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		smallestLargest(s);
	}
	
	public static void smallestLargest(Scanner s) {
		prnt("How many numbers will you enter?: ");
		int num = s.nextInt();
		int max=-2147483648, min=2147483647;
		
		for(int i=1;i<=num;i++) {
			System.out.print("Number "+i+" :");
			int x = s.nextInt();
			System.out.print(x);
			if(x > max) {
				max = x;
			}
			if(x < min) {
				min = x;
			}
			prnt("");
		}
		
		prnt("Largest: "+ max);
		prnt("Smallest: "+min);
	}
	
	
	
	public static void prnt(String s) {
		System.out.println(s);
	}
}
