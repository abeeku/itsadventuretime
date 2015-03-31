package schoolsystem;
public class Student extends Person {
	int level;
	static int count;
	int studentId;

	public Student(String fName,String lName,int gLevel) {
		super(fName,lName);
		setLevel(gLevel);
		count++;studentId = count;
	}
	public void setLevel(int gL){
        if(gL>=0 && gL<=12) level = gL;
        else level = 0;
    }
    
   

	public int getLevel() {
		return level;
	}

	public String toString() {
		return super.toString() +"\n"+"   "+"Grade Level: " + level +"\n   ID #: " + studentId;
	}
}