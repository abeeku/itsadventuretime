
public class Mod {

	public static void main(String[] args) {
		int Time = 5000;
		int hours = Time/3600;      
		int mins = (Time%3600)/60;  
		int seconds = Time%60;   
		
		System.out.println(hours+":"+ mins+":"+seconds);
		System.out.println(Time + " seconds has "+ hours + " hours, " + mins+" minutes, and "+seconds+" seconds");

	}

}
