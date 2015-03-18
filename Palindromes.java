import java.util.Scanner;


public class Palindromes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("I dare you to give me a palindrome:\\ \n  ");
		String pal = s.nextLine();
		System.out.println("[ "+ pal+" ]");
		String p = pal.replace(" ", "").toUpperCase().trim().replace(".", "").replace(",", "").replace("!", "");
		boolean check = true;
		
		for(int i =0;i<=p.length()-1;i++) {
			if(p.charAt(i)==p.charAt(p.length()-(i+1))) {
				check = true;
			} else {
				check = false;
				break;
			}
		}
		//System.out.print("Loading....\n[");
		//for(int i = 0;i<=100) {
		//	System.out.print()
		//}
		
		//String freep = "RACE CAR";
		//String p = freep.toUpperCase().trim();
		//p = p.replace(" ", "");
		//boolean pal = true;
		//String endIndex = p.substring(p.length()-1,p.length()).replace(" ", "");
		//System.out.println(p.substring(0,1) + p.substring(p.length()-1,p.length()) );
		/*if (p.charAt(0)==p.charAt(p.length()-1)) {
			System.out.println("worked");
		}
		
		for(int i=0;i<=p.length()-1;i++) {
			if (p.charAt(i)== p.charAt(p.length()-1)) {
				System.out.println("worked");
			}
		}
		System.out.println((p.charAt(0))+""+(p.charAt(p.length()-1)));
		System.out.println(p.charAt(1) + ""+ (p.charAt(p.length()-2)));
		*/
	/*	for(int i=0;i<=p.length()-1;i++) {
			
			System.out.println((p.charAt(i))+""+(p.charAt(p.length()-i-1)));
			if((p.charAt(i))==(p.charAt(p.length()-i-1))) {
				System.out.println("worked");
				pal = true;
			} else {
				pal=false;
			}
		}*/
		/*System.out.println(p.substring(1,2) + p.substring(p.length()-2,p.length()-1) );
		System.out.println(p.substring(2,3) + p.substring(p.length()-3,p.length()-2) );
		System.out.println(p.substring(3,4) + p.substring(p.length()-4,p.length()-3) );
		System.out.println(p.substring(4,5) + p.substring(p.length()-5,p.length()-4) );
		System.out.println(p.substring(5,6) + p.substring(p.length()-6,p.length()-5) );
		System.out.println(p.substring(6,7) + p.substring(p.length()-7,p.length()-6) );
		*/
		
		/*for(int i=1;i<=p.length();i++) {
			System.out.println(p.substring((i-1),i) + p.substring(p.length()-i,p.length()-(i-1)));
			if((p.substring((i-1),i) == (p.substring(p.length()-i,(p.length()-(i-1))).trim())))  {
				pal = true;
				System.out.println("rr");
				
			}
	
		}*/
		System.out.println(check ? "Good job! :) That is a palindrome":"NOT a palindrome!");
		
		
		
	}

}
