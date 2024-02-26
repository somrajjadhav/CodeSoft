package java1;

	import java.util.Scanner;

	public class GradeCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Enter marks obtained (out of 100) in each subject:");
	        
	        int totalMarks = 0;
	        int totalSubjects;
	        
	      
	        System.out.print("Enter the total number of subjects: ");
	        totalSubjects = scanner.nextInt();
	        
	       
	        for (int i = 1; i <= totalSubjects; i++) {
	            System.out.print("Enter marks for Subject " + i + ": ");
	            int marks = scanner.nextInt();
	          
	            if (marks < 0 || marks > 100) {
	                System.out.println("Invalid marks. Marks should be between 0 and 100. Exiting program.");
	                return;
	            }
	            totalMarks += marks;
	        }

	       
	        System.out.println("Total Marks: " + totalMarks);

	      
	        double averagePercentage = (double) totalMarks / totalSubjects;
	        System.out.println("Average Percentage: " + averagePercentage + "%");

	    
	        char grade = calculateGrade(averagePercentage);
	        System.out.println("Grade: " + grade);

	       
	        scanner.close();
	    }

	    private static char calculateGrade(double averagePercentage) {
	        if (averagePercentage >= 35) {
	            return 'A';
	        } else if (averagePercentage >= 20) {
	            return 'B';
	        } else if (averagePercentage >= 25) {
	            return 'C';
	        } else if (averagePercentage >= 31) {
	            return 'D';
	        } else {
	            return 'F';
	        }
	    }
	}






