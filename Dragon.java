import java.util.Arrays;


public class Dragon {
	int tailLength;
	String name;
	static int count;
	int ID;
	boolean mouthOpen;
	int health;
	String wingType;
	String[] accessories;
	boolean breathFire;
	boolean isSnakelike;
	
	public Dragon() {
		this("Morty",25,false,"Regular Wings",false,new String[] {"scales"},true);
		
	}
	public Dragon(String name){
		this(name,25,false,"Regular Wings",false,new String[] {"scales"},true);
	}
	public Dragon(String name,String[] acc ) {
		this(name,25,false,"Regular Wings",false,acc,true);
	}
	
	public Dragon(
			String name,
			int tL,
			boolean mO,
			String wT,
			boolean iS,
			String acc[],
			boolean bF){
		setName(name);
		setWingType(wT);
		setTailLength(tL);
		setAccessories(acc);
		setBreathFire(bF);
		setMouthOpen(mO);
		setSnakelike(iS);
		setHealth(100);

		count++;
		ID = count;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "\nDragon "+ID+" - "+ name +
				"\n\t   |_____Tail Length: " + tailLength +" centimeters"+ 
				"\n\t\t Mouth Open: " + mouthOpen
				+ "\n\t\t Health: " + health + " points"+
				"\n\t\t Wing Type: " + wingType
				+ "\n\t\t Accessories: " + Arrays.toString(accessories)
				+ "\n\t\t Breathes Fire?: " + breathFire +
				"\n\t\t Snakelike?: " + isSnakelike
				;
	}

	public void hit(){
		health =-10;
	}
	public void heal(int points) {
		setHealth(health+points);
	}
	
	
	public void toggleMouth(){
		if(mouthOpen) mouthOpen = false;
		else mouthOpen = true;
	}
	
	public void breatheFire(Dragon other) {
		if(mouthOpen) other.health-=50 ; 
	}

	public int getTailLength() {
		return tailLength;
	}

	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}

	public boolean isMouthOpen() {
		return mouthOpen;
	}

	public void setMouthOpen(boolean mouthOpen) {
		this.mouthOpen = mouthOpen;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
	if(health<=100) this.health = health;
	}

	public String getWingType() {
		return wingType;
	}

	public void setWingType(String wingType) {
		this.wingType = wingType;
	}

	public String[] getAccessories() {
		return accessories;
	}

	public void setAccessories(String[] accessories) {
		this.accessories = accessories;
	}

	public boolean isBreathFire() {
		return breathFire;
	}

	public void setBreathFire(boolean breathFire) {
		this.breathFire = breathFire;
	}

	public boolean isSnakelike() {
		return isSnakelike;
	}

	public void setSnakelike(boolean isSnakelike) {
		this.isSnakelike = isSnakelike;
	}
}
