package schoolsystem;

public class Teacher extends Person {
	String subject;
	
	public Teacher(String fN, String lN,String subject) {
		super(fN, lN);
		setSubject(subject);
		
	}



	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString() +"\n   Subject: "+subject;
	}
}
