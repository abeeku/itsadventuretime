public class DrawFigures1 {
    public static void main(String[] args) {
	// They all need to be put in seperate methods for programs decomposition
		draw_tri_up();
		draw_tri_down();
		System.out.println();
		draw_tri_down();
		draw_tri_up();
		System.out.println();
		draw_tri_up();
		
		draw_US_flag();
		
		draw_tri_up();
		
		
		
 /*       System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
        System.out.println();
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println();
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\"); 
		*/
    }
	
	public static void draw_tri_up() {
		System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
	}
	
	public static void draw_tri_down() {
		System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
	}
	
	public static void draw_US_flag() {
		draw_square();
        System.out.println("|United|");
        System.out.println("|States|");
		draw_square();
	}
	
	public static void draw_square() {
		System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
	}
		
}
