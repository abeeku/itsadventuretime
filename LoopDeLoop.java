
public class LoopDeLoop {
	final static int SIZE=4;

	public static void main(String[] args) {
	
		triangle();
		
		seperator();
		
				// Top square
				double_up();
				
				double_down();
				
				seperator();
				//square 2
				
				double_down();
				double_up();	
				
				
			seperator();
			triangle();
				
		
	}
	
	
	public static void seperator(){
		//Seperator
		for(int i=1;i<=1;i++) {
			for(int j=1;j<=1;j++) {
				System.out.print("+");
			}
			for(int j=1;j<=(SIZE*2);j++) {
				System.out.print("=*");
			}
			for(int j=1;j<=1;j++) {
				System.out.print("+");
			}
			System.out.println();
			
		}
		
	}
	
	public static void triangle() {
		//bottom triangle
		for(int i=1;i<=(2*SIZE)-1;i++) {
			// Print Spaces
			for (int j = 1; j <= (2*SIZE)-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("/");
			}
			for (int j = 1; j <= 2; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
	
	public static void double_up() {
		for(int i=1;i<=(SIZE);i++) {
			
			for(int j=1;j<=1;j++) System.out.print("|");
			
			// Print periods
			for (int j = 1; j <= SIZE-i; j++) {
				System.out.print(".");
			}
			
			//Triangle
			for (int j = 1; j <= i; j++) {
				System.out.print("/\\");
			}
			
			//Periods
			for (int j = 1; j <= 2*(SIZE-i); j++) {
				System.out.print(".");
			}
			
			//Up triangles
			for (int j = 1; j <= i; j++) {
				System.out.print("/\\");
			}
			//periods
			for (int j = 1; j <= SIZE-i; j++) {
				System.out.print(".");
			}
			for(int j=1;j<=1;j++) System.out.print("|");
			System.out.println();
		}
	}
	
	public static void double_down() {
		for(int i=1;i<=SIZE;i++) {
			//vertical lines
			for(int j=1;j<=1;j++) System.out.print("|");
			
			// Print periods
			for (int j = 1; j <= i-1; j++) {
				System.out.print(".");
			}
			for (int j = 1; j <= (SIZE+1)-i; j++) {
				System.out.print("\\/");
			}
			for (int j = 1; j <= 2*(i-1); j++) {
				System.out.print(".");
			}
			
			for (int j = 1; j <= (SIZE+1)-i; j++) {
				System.out.print("\\/");
			}
			
			for (int j = 1; j <= i-1; j++) {
				System.out.print(".");
			}
			for(int j=1;j<=1;j++) System.out.print("|");
			System.out.println();
		}
	}

}


