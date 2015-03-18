import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Hangman {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Random r = new Random();
		
		
	//ArrayList<String> fg;
	System.out.print("Pick a word for me to get hangman for. How many letters?: ");
	int let = s.nextInt();
	String g="";
	int numgues = 0;
	System.out.println("Say (thats the word) when I get it right");
	String resp = "";
	while(resp!="thats the word") {
		char c = (char)(r.nextInt(26)+65);
	System.out.print("Is "+ c+" one of the letters? (Y/N):");
		
	String ans = s2.nextLine();
		System.out.println(ans);
		if(ans=="N"){
			numgues+=1;	
		} else if(ans=="Y") {
			g+=Character.toString(c);
		}
		System.out.println(g);
		System.out.println(numgues);
		
		switch(numgues) {
		case 2:
			System.out.println("      _______");
			System.out.println("     |/      |");
			System.out.println("     |      (_)");
			System.out.println("     |      ");
			System.out.println("     |       ");
			System.out.println("     |      ");
			System.out.println("     |");
			System.out.println("    _|___");
		case 3:
			System.out.println("      _______");
			System.out.println("     |/      |");
			System.out.println("     |      (_)");
			System.out.println("     |       |");
			System.out.println("     |       ");
			System.out.println("     |      ");
			System.out.println("     |");
			System.out.println("    _|___");
		case 4:
			System.out.println("      _______");
			System.out.println("     |/      |");
			System.out.println("     |      (_)");
			System.out.println("     |       |/");
			System.out.println("     |       ");
			System.out.println("     |      ");
			System.out.println("     |");
			System.out.println("    _|___");
		case 5:
			System.out.println("      _______");
			System.out.println("     |/      |");
			System.out.println("     |      (_)");
			System.out.println("     |      \\|/");
			System.out.println("     |       ");
			System.out.println("     |      ");
			System.out.println("     |");
			System.out.println("    _|___");
		case 6:
			System.out.println("      _______");
			System.out.println("     |/      |");
			System.out.println("     |      (_)");
			System.out.println("     |      \\|/");
			System.out.println("     |       |");
			System.out.println("     |       ");
			System.out.println("     |");
			System.out.println("    _|___");
		case 7:
			System.out.println("      _______");
			System.out.println("     |/      |");
			System.out.println("     |      (_)");
			System.out.println("     |      \\|/");
			System.out.println("     |       |");
			System.out.println("     |      / ");
			System.out.println("     |");
			System.out.println("    _|___");
		case 8:
			System.out.println("      _______");
			System.out.println("     |/      |");
			System.out.println("     |      (_)");
			System.out.println("     |      \\|/");
			System.out.println("     |       |");
			System.out.println("     |      / \\");
			System.out.println("     |");
			System.out.println("    _|___");
		}
		
	}
	
	
	System.out.println("      _______");
	System.out.println("     |/      |");
	System.out.println("     |      (_)");
	System.out.println("     |      \\|/");
	System.out.println("     |       |");
	System.out.println("     |      / \\");
	System.out.println("     |");
	System.out.println("    _|___");
	}
	
	
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    // only got here if we didn't return false
	    return true;
	}
}
