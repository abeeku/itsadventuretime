
public class Mod {

	public static void main(String[] args) {
		int Time = 5000;
		int hours = Time/3600;      
		int mins = (Time%3600)/60;  
		int seconds = Time%60;   
		
		System.out.println(hours+":"+ mins+":"+seconds);
		if(hours<1){
			System.out.println(Time + " seconds has "+ hours + " hours, " + mins+" minutes, and "+seconds+" seconds");
		} else {
			System.out.println(Time + " seconds has "+ hours + " hour, " + mins+" minutes, and "+seconds+" seconds");
		}

	}

}
