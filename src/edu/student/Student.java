package edu.student;

public class Student {
	 private String name;
	    private int rollNumber;
	    private int[] grades;
	    
	    public Student(String name, int rollNumber, int numSubjects) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.grades = new int[numSubjects];
	    }
	
	    public String getName() {
	        return name;
	    }
	    
	    public int getRollNumber() {
	        return rollNumber;
	    }
	    
	    public int[] getGrades() {
	        return grades;
	    }

}
