import java.util.ArrayList;
import java.util.Scanner;


public class DragonDriver {

	public static void main(String[] args) {
		ArrayList<Dragon> dragons = new ArrayList<Dragon>();
		Dragon mark = new Dragon(
				"Mark",
				200,
				true,
				"None",
				true,
				new String[] {"nono"},
				true
				);
		Dragon eylin = new Dragon(
				"Eylin",
				65,
				true,
				"Wavy",
				false,
				new String[] {"mouth","horns"},
				true
				);
		Dragon prince = new Dragon(
				"Prince",
				46,
				false,
				"Large",
				false,
				new String[] {""},
				true
				);
		Dragon jillian = new Dragon(
				"Jillian",
				30,
				false,
				"Small",
				false,
				new String[] {"horns"},
				true
				);
		Dragon anthony = new Dragon(
				"Anthony",
				40,
				true,
				"Turkey",
				true,
				new String[] {"pilgrim hat","boots","stingray tail"},
				false
				);
		Dragon liberty = new Dragon(
				"Liberty", //Name
				800, // Tail Length
				false, //Mouth Open
				"None", // Wings
				true, // SnakeLike?
				new String[] {"mohawk"}, //Accessories
				true // Breathe Fire
				);
		
		Dragon ku = new Dragon(
				"Abeeku", //Name
				121, // Tail Length
				true, //Mouth Open
				"Dragon", // Wings
				false, // SnakeLike?
				new String[] {"muscles"}, //Accessories
				true // Breathe Fire
				);
		
		Dragon kyle = new Dragon(
				"Kyle", //Name
				51, // Tail Length
				true, //Mouth Open
				"Fly", // Wings
				false, // SnakeLike?
				new String[] {"stingray tail"}, //Accessories
				true // Breathe Fire
				);
		Dragon imani = new Dragon(
				"Imani", //Name
				75, // Tail Length
				false, //Mouth Open
				"Span", // Wings
				false, // SnakeLike?
				new String[] {"sunglasses"}, //Accessories
				false // Breathe Fire
				);
		Dragon evan = new Dragon(
				"Evan", //Name
				15, // Tail Length
				false, //Mouth Open
				"Batlike", // Wings
				false, // SnakeLike?
				new String[] {"nono"}, //Accessories
				false // Breathe Fire
				);
		Dragon yoli = new Dragon(
				"Yoli", //Name
				15, // Tail Length
				false, //Mouth Open
				"None", // Wings
				false, // SnakeLike?
				new String[] {"horns","bow","spots"}, //Accessories
				true // Breathe Fire
				);
		Dragon richard = new Dragon(
				"Richard",
				new String[] {"fangs"}
				);
		Dragon franchesca = new Dragon(
				"Franchesca", //Name
				15, // Tail Length
				true, //Mouth Open
				"Regular", // Wings
				true, // SnakeLike?
				new String[] {"horns","extra hands"}, //Accessories
				true // Breathe Fire
				);
		Dragon christian = new Dragon(
				"Christian", //Name
				new String[] {"fangs"} //Accessories
				
				);
		Dragon chrissy = new Dragon(
				"Chrissy", //Name
				new String[] {"red eyes"} //Accessories
				
				);
		Dragon festus = new Dragon(
				"Festus", //Name
				new String[] {"horns","fins"} //Accessories
				
				);
		
		dragons.add(ku);
		dragons.add(festus);
		dragons.add(kyle);
		dragons.add(christian);
		dragons.add(chrissy);
		dragons.add(eylin);
		dragons.add(mark);
		dragons.add(yoli);
		dragons.add(franchesca);
		dragons.add(richard);
		dragons.add(evan);
		dragons.add(liberty);
		
		//for(int i=0;i<=dragons.size();i++) {
			System.out.println("Before Changes");
			System.out.println(dragons);
			System.out.println("===================================================================Dragons===========================================================");
			System.out.println("   (  )   /\\   _                 (     ");
			System.out.println("    \\ |  (  \\ ( \\.(               )                      _____");
			System.out.println("  \\  \\ \\  `  `   ) \\             (  ___                 / _   \\");
			System.out.println(" (_`    \\+   . x  ( .\\            \\/   \\____-----------/ (o)   \\_");
			System.out.println("- .-               \\+  ;          (  O                           \\____");
			System.out.println("                          )        \\_____________  `              \\  /");
			System.out.println("(__                +- .( -'.- <. - _  VVVVVVV VV V\\                 \\/");
			System.out.println("(_____            ._._: <_ - <- _  (--  _AAAAAAA__A_/                  |");
			System.out.println("  .    /./.+-  . .- /  +--  - .     \\______________//_              \\_______");
			System.out.println("  (__ ' /x  / x _/ (                                  \\___'          \\     /");
			System.out.println(" , x / ( '  . / .  /                                      |           \\   /");
			System.out.println("    /  /  _/ /    +                                      /              \\/");
			System.out.println("   '  (__/                                             /                  \\");
			System.out.println("                     /\\         /\\__");
			System.out.println("                   // \\       (  0 )_____/\\            __");
			System.out.println("                  // \\ \\     (vv          o|          /^v\\");
			System.out.println("                //    \\ \\   (vvvv  ___-----^        /^^/\\vv\\");
			System.out.println("              //  /     \\ \\ |vvvvv/               /^^/    \\v\\");
			System.out.println("             //  /       (\\\\/vvvv/              /^^/       \\v\\");
			System.out.println("            //  /  /  \\ (  /vvvv/              /^^/---(     \\v\\");
			System.out.println("           //  /  /    \\( /vvvv/----(O        /^^/           \\v\\");
			System.out.println("          //  /  /  \\  (/vvvv/               /^^/             \\v|");
			System.out.println("        //  /  /    \\( vvvv/                /^^/               ||");
			System.out.println("       //  /  /    (  vvvv/                 |^^|              //");
			System.out.println("      //  / /    (  |vvvv|                  /^^/            //");
			System.out.println("     //  / /   (    \\vvvvv\\          )-----/^^/           //");
			System.out.println("    // / / (          \\vvvvv\\            /^^^/          //");
			System.out.println("   /// /(               \\vvvvv\\        /^^^^/          //");
			System.out.println("  ///(              )-----\\vvvvv\\    /^^^^/-----(      \\\\");
			System.out.println(" //(                        \\vvvvv\\/^^^^/               \\\\");
			System.out.println("/(                            \\vvvv^^^/                 //");
			System.out.println("                                \\vv^/         /        //");
			System.out.println("                                             /<______//");
			System.out.println("                                            <<<------/");
			System.out.println("                                             \\<");
			System.out.println("                                               \\");
			Dragon d1 = new Dragon();
			dragons.add(d1);
			Dragon d2 = new Dragon("Rick James",70,true,"wide",true,(new String[] {"hat","boots"}),false);
			d1.breatheFire(d2);
			d1.toggleMouth();
			d1.setName(ku.getName());
			d1.hit();
			d1.setWingType(ku.getWingType());
			d1.setBreathFire(ku.isBreathFire());
			d1.setAccessories(ku.getAccessories());
			d1.setSnakelike(ku.isSnakelike());
			d1.setHealth(ku.getHealth());
			d1.setTailLength(ku.getTailLength());
			d1.setWingType(ku.getWingType());
			d1.setWingType(ku.getWingType());
			d1.setWingType(ku.getWingType());
			
			
			
			d1.breatheFire(d2);
			System.out.println(d1);
			System.out.println(d2);
			d1.setWingType("Fan");
		
			d2.heal(40);
			System.out.println("After changes");
			System.out.println(dragons);
			
			System.out.println("Do you want to make your own dragon?");
			
			Scanner s = new Scanner(System.in);
			Scanner s2 = new Scanner(System.in);
			Scanner s3 = new Scanner(System.in);
			Scanner s4 = new Scanner(System.in);
			
			if (s.nextLine().equals("YES!")){
				System.out.print("Name: ");
				String name = s.nextLine();
				System.out.print("Tail length: ");
				int tL = s.nextInt();
				System.out.print("Mouth Open?(true/false): ");
				boolean mO = s.nextBoolean();
				System.out.print("Wing Type: ");
				String wT = s2.nextLine();
				System.out.print("Is Snakelike?(true/false): ");
				boolean iS = s.nextBoolean();
				String [] acc = new String[] {};
				System.out.print("Accessories (Y/N): ");
				if(s3.nextLine().equals("Y")){
					System.out.println("Enter all your accessories seperated by commas:");
					String val = s4.nextLine();
					 acc = val.split(",");
				} else {
					acc = new String[] {};
				}
				System.out.print("Breathes Fire?(true/false): ");
				boolean bf = s.nextBoolean();
				System.out.println("Your dragon is ready..........");
				Dragon custom = new Dragon(name,tL,mO,wT,iS,acc,bf);
				System.out.println(custom);
				
			}else {
				System.out.println("Thats too bad. :( Youre missing out");
			};
		}
			
	

}
