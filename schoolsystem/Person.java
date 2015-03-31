package schoolsystem;

public class Person {
	String fname, lname;
	
	public Person() {
		this("John","Doe");
	}

	public Person(String fN, String lN) {
		
		setLname(lN);
		setFname(fN);
	}

	public String toString(){
		return "\n"+lname+", "+fname;
	}
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	
}
