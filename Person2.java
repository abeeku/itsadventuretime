public class Person2 {
	String fname, lname;
	
	public Person2() {
		this("John","Doe");
	}

	public Person2(String fN, String lN) {
		
		setLname(lN);
		setFname(fN);
	}

	public String toString(){
		return "\n==========================================\n"+lname+", "+fname+"\n";
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
