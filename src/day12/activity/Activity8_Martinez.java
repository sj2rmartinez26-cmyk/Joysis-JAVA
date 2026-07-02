package day12.activity;

import java.util.Scanner;

public class Activity8_Martinez {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Number of Student(s): ");
        int numStudents = scanner.nextInt(); 
        System.out.print("Enter Number of Subject(s): ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] subjects = new String [numSubjects];
        String[] students = new String [numStudents];
        
        
        String[][][] studentsTable = new String [numStudents][numSubjects][2];
       
        System.out.println("\nEnter Student Names");
        for (int i = 0; i < numStudents; i++){
            System.out.print("Enter Student " + (i+1) + " Name: ");
            students[i] = scanner.nextLine();
        }
        
        System.out.println("\nEnter Subject Description");
        for (int i = 0; i < numSubjects; i++){
            System.out.print("Enter Subject " + (i+1) + " Description: ");
            subjects[i] = scanner.nextLine();
        }
        
        System.out.println("\nEnter Student Grades");
        for (int i = 0; i < numSubjects; i++){
            for (int j = 0; j < numStudents; j++) { 
                System.out.print("Enter Grade of " + students[j] + " for " + subjects[i] + ": ");
                String input = scanner.nextLine();
                
                studentsTable[j][i][0] = subjects[i]; 
                studentsTable[j][i][1] = input;       
            } 
        }
        
        
        System.out.println("\n=================================== STUDENT GRADES SUMMARY ===================================");
        
       
        System.out.printf("%-15s", "Student Name");
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("%-15s", subjects[i]);
        }
        System.out.printf("%-15s\n", "Grade Average"); 
        System.out.println("----------------------------------------------------------------------------------------------");
        
        
        for (int j = 0; j < numStudents; j++) {
            System.out.printf("%-15s", students[j]); 
            
            double totalGradeSum = 0.0; 
            
            for (int i = 0; i < numSubjects; i++) {
                double gradeValue = Double.parseDouble(studentsTable[j][i][1]);
                System.out.printf("%-15.2f", gradeValue); 
                
                totalGradeSum += gradeValue; 
            }
            
           
            double gradeAverage = totalGradeSum / numSubjects;
            
            
            System.out.printf("%-15.2f\n", gradeAverage); 
        }
        System.out.println("==============================================================================================");
    }
}