import java.util.Scanner;


public class EvenSumMax {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		evenSumMax(s);
	}
	
	public static void evenSumMax(Scanner s) {
		prnt("How many numbers do you want to enter: ");
		int n = s.nextInt();
		prntln("");
		int even_max=0,even_sum = 0;
		for(int i =1;i<=n;i++) {
			System.out.print("Next Integer: ");
			int x = s.nextInt();
			prntln("");
			if (x%2==0) {
				even_sum +=x;
				if(x > even_max) {
					even_max = x;
				}
			} 
			
		}
	//	prntln("Even sum = "+even_sum+", "+ "even max = " +even_max);
		System.out.printf("Even sum = %d, even max = %d",even_sum,even_max);
		
	}
	
	public static void prnt(String s) {
		System.out.print(s);
	}
	
	public static void prntln(String s) {
		System.out.println(s);
	}
}
