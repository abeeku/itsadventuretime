public class Student extends Person {
    
    double gpa;
    int level;
    static int count;
    int studentId;
    
    public Student() {
    	
        this("None", "None",0,0.0);
        
    }
    
    public Student(String firstName, String lastName, int gradeLevel, double gpa) {
    	 super(firstName,lastName); 
        count++;studentId = count;
       setGPA(gpa);setgradeLevel(gradeLevel);
    }
    
    
    
    
    public void setGPA(double g) {
        if(g>=0.0 && g<=4.5)  gpa = g;
        else gpa=0.0;
    }
    
    public void setgradeLevel(int gL){
        if(gL>=0 && gL<=12) gradeLevel = gL;
        else gradeLevel = 0;
    }
    
    public double getGpa() {
		return gpa;
	}

	public int getGradeLevel() {
		return level;
	}

	public String toString() {
        return super.toString()+"\n------------------------------------------\nStudent Stats: \n\tGPA: "+gpa+"\n\t"+"Grade Level: "+level+"\n    ID #: "+studentId;
    }
    
}