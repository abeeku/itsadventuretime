package schoolsystem;

public class HighSchoolStudent extends Student{

	double gpa;
	
	public HighSchoolStudent(String fName, String lName, int gLevel, double gpa) {
		super(fName,lName,gLevel);
		setGPA(gpa);
	}

	 public void setGPA(double g) {
	        if(g>=0.0 && g<=5)  gpa = g;
	        else gpa=0.0;
	    }
	  
	    
	    public double getGpa() {
			return gpa;
		}

	    public String toString() {
	    	return super.toString() + "\n   GPA: " + gpa;
	    }
}
