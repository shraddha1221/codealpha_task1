package edu.student;

public class Student {
	 private String name;
	    private int rollNumber;
	    private int[] grades;
	    
	    // Constructor
	    public Student(String name, int rollNumber, int numSubjects) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.grades = new int[numSubjects];
	    }
	    
	    // Getter for name
	    public String getName() {
	        return name;
	    }
	    
	    // Getter for roll number
	    public int getRollNumber() {
	        return rollNumber;
	    }
	    
	    // Getter for grades array
	    public int[] getGrades() {
	        return grades;
	    }

}
