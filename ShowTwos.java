import java.util.Random;
import java.util.Scanner;


public class ShowTwos {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		printAverage(s);
	}
	

	public static void printAverage(Scanner s) {
	    
	    int num = 0;
	    int sum = 0;
	    int numnums = 1;
	    while(num >= 0) {
	    	System.out.print("Type a number: ");
	    	num = s.nextInt();
	        sum+=num;
	        numnums++;
	    }
	    
	    System.out.println("Average = " +((double)sum/numnums));
	}

public static void diceSum() {
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    System.out.print("Desired dice sum: ");
    int sum = s.nextInt();
    System.out.println();
    int ans = 0;
    while(ans != sum) {
        int num1 = r.nextInt(6)+1;
        int num2 = r.nextInt(6)+1;
        System.out.println(num1 + " and "+num2 + " = "+(num1+num2));
        ans = num1+num2;
    }
    
}
	}


