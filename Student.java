public class Student {
    String firstName, lastName;
    double gpa;
    int gradeLevel;
    static int count;
    int studID;
    
    public Student() {
        this("None", "None",0,0.0);
        
    }
    
    public Student(String firstName, String lastName, int gradeLevel, double gpa) {
        
        count++;
        studID = count;
        setGPA(gpa);
        this.lastName = lastName;
        this.firstName = firstName;
        setgradeLevel(gradeLevel);
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
		return gradeLevel;
	}

	public String toString() {
        return lastName+", "+firstName+"\nGPA: "+gpa+"\n"+"Grade Level: "+gradeLevel+" id # "+studID;
    }
    
}