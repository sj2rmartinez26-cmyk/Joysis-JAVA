package day12.activity;

import java.util.Scanner;

public class Activity8_Martinez {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Number of Student(s): ");
        int numStudents = scanner.nextInt(); 
        System.out.print("Enter Number of Subject(s): ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        
        String[] subjects = new String [numSubjects];
        String[] students = new String [numStudents];
        
        // Structure: [studentIndex][subjectIndex][0 = Subject Name, 1 = Grade]
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
        
        // --- DISPLAY DATA IN A TABLE LAYOUT WITH AVERAGE ---
        System.out.println("\n=================================== STUDENT GRADES SUMMARY ===================================");
        
        // Print Header Row (Student Name followed by all the subjects + Grade Average)
        System.out.printf("%-15s", "Student Name");
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("%-15s", subjects[i]);
        }
        System.out.printf("%-15s\n", "Grade Average"); // New column header
        System.out.println("----------------------------------------------------------------------------------------------");
        
        // Print Data Rows pulling values directly out of your studentsTable
        for (int j = 0; j < numStudents; j++) {
            System.out.printf("%-15s", students[j]); // Print Student Name
            
            double totalGradeSum = 0.0; // Variable to accumulate the sum for the current student
            
            for (int i = 0; i < numSubjects; i++) {
                double gradeValue = Double.parseDouble(studentsTable[j][i][1]);
                System.out.printf("%-15.2f", gradeValue); 
                
                totalGradeSum += gradeValue; // Add each grade to the running total
            }
            
            // Calculate the average for the current student
            double gradeAverage = totalGradeSum / numSubjects;
            
            // Print the final average in its respective column
            System.out.printf("%-15.2f\n", gradeAverage); 
        }
        System.out.println("==============================================================================================");
    }
}