package schoolsystem;

import java.util.ArrayList;

public class School {
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    
    public School(ArrayList<Student> s, ArrayList<Teacher> t) {
        students = s;
        teachers = t;
    }
    
    public String toString2() {
        return "Faculty:\n"+teachers.toString() .replace("[", "").replace("]", "").trim() +"\n\n\n"+"Student Body:\n"+students.toString().replace(",", "") .replace("[", "").replace("]", "").trim(); 
    }
    
    
    public String toString() {
    	String s = "";
    	s+="Faculty: \n";
    	for(Teacher t: teachers) {
    		s+=t.toString()+"\n";
    	}
    	
    	s+="Student Body: \n";
    	for(Student st: students) {
    		s+=st.toString()+"\n";
    	}
    	
    	return s;
    }
    
    
    public String getGradeLevel(int level) {
        ArrayList<Student> gradestudents = new ArrayList<Student>();
        for(int i=0;i<=students.size()-1;i++) {
            if(students.get(i).getLevel()==level) {
                gradestudents.add(students.get(i));
            }
        }
        if (gradestudents.size() == 0)
        	return "";
        String s = "";
        for(Student st: gradestudents) {
    		s+=st.toString()+"\n";
    	}
    	
        return s;  
        }
    
    
}
