package edu.student;

import java.util.Scanner;

public class StudentGradeTracker {
	 private Student[] students;
	    private int numStudents;
	    private int numSubjects;
	    private Scanner scanner;

	    public StudentGradeTracker(int numStudents, int numSubjects) {
	        this.numStudents = numStudents;
	        this.numSubjects = numSubjects;
	        this.students = new Student[numStudents];
	        this.scanner = new Scanner(System.in);
	    }

	    public void inputStudentData() {
	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("\nEnter details for student " + (i + 1) + ":");
	            System.out.print("Name: ");
	            String name = scanner.nextLine();
	            System.out.print("Roll Number: ");
	            int rollNumber = scanner.nextInt();
	            scanner.nextLine(); // Consume newline left-over
	            
	            students[i] = new Student(name, rollNumber, numSubjects);
	            
	            System.out.println("Enter grades for " + numSubjects + " subjects:");
	            for (int j = 0; j < numSubjects; j++) {
	                System.out.print("Enter grade for subject " + (j + 1) + ": ");
	                students[i].getGrades()[j] = scanner.nextInt();
	            }
	            scanner.nextLine(); // Consume newline left-over
	        }
	    }

	    public double calculateAverage(Student student) {
	        int[] grades = student.getGrades();
	        if (grades.length == 0) {
	            return 0;
	        }
	        int sum = 0;
	        for (int grade : grades) {
	            sum += grade;
	        }
	        return (double) sum / grades.length;
	    }

	    public int findHighestGrade(Student student) {
	        int[] grades = student.getGrades();
	        if (grades.length == 0) {
	            return 0;
	        }
	        int highest = grades[0];
	        for (int i = 1; i < grades.length; i++) {
	            if (grades[i] > highest) {
	                highest = grades[i];
	            }
	        }
	        return highest;
	    }

	    public int findLowestGrade(Student student) {
	        int[] grades = student.getGrades();
	        if (grades.length == 0) {
	            return 0;
	        }
	        int lowest = grades[0];
	        for (int i = 1; i < grades.length; i++) {
	            if (grades[i] < lowest) {
	                lowest = grades[i];
	            }
	        }
	        return lowest;
	    
	    public void displayStudentData() {
	        for (int i = 0; i < numStudents; i++) {
	            Student student = students[i];
	            System.out.println("\nStudent " + (i + 1) + " Details:");
	            System.out.println("Name: " + student.getName());
	            System.out.println("Roll Number: " + student.getRollNumber());
	            System.out.println("Grades:");
	            int[] grades = student.getGrades();
	            for (int j = 0; j < numSubjects; j++) {
	                System.out.println("Subject " + (j + 1) + ": " + grades[j]);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number of students: ");
	        int numStudents = input.nextInt();
	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = input.nextInt();
	        
	        input.nextLine(); // Consume newline left-over

	        StudentGradeTracker tracker = new StudentGradeTracker(numStudents, numSubjects);

	        tracker.inputStudentData();
	        tracker.displayStudentData();

	        for (int i = 0; i < numStudents; i++) {
	            Student student = tracker.students[i];
	            double average = tracker.calculateAverage(student);
	            int highest = tracker.findHighestGrade(student);
	            int lowest = tracker.findLowestGrade(student);

	            System.out.println("\nStudent " + student.getName() + "'s Metrics:");
	            System.out.println("Average grade: " + average);
	            System.out.println("Highest grade: " + highest);
	            System.out.println("Lowest grade: " + lowest);
	        }

	        input.close();
	    }

}
