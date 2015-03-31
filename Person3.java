
public class Person3 {
	String fname, lname;
	int age;
	
	public Person3() {
		this("John","Doe",0);
	}

	public Person3(String fN, String lN, int a) {
		setAge(a);
		setLname(lN);
		setFname(fN);
	}

	public String toString(){
		return "\n==========================================\n"+lname+", "+fname+"\n"+"Age: "+age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
