import java.util.Scanner;
import java.util.Arrays;
public class NewStudentGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
import java.util.Scanner;
import java.util.Arrays;
public class NewStudentGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int numberOfStudent = 0;
		int numberOfSubject = 0;
		int totalScore = 0;
		double average = 0;
	System.out.println("Enter number of students");
	numberOfStudent = input.nextInt();

	System.out.println("Enter number of subject");
	numberOfSubject = input.nextInt();
	System.out.println("saving >>>>>>>>>>>>>>>>>>>");
	System.out.println("saved successful");
	  int[][] studentData;
	studentData = new int[numberOfStudent][numberOfSubject];


	int[][] studentData = new int[numberOfStudent][numberOfSubject];
	double[] averageScore = new double[numberOfSubject];
	int[]totalStudentScore = new int [numberOfStudent];
	for(int count1 = 0; count1 < numberOfStudent; count1++){
		System.out.println("Entering score for student");
		System.out.printf("Entering score for student%d%n",(count1 +1));

	for(int counter1 = 0; counter1 < numberOfSubject; counter1++){
		for(int counter1 = 0; counter1 < numberOfSubject; counter1++){

	 System.out.println("Enter score subject\n");
	 studentData[count1][counter1] = input.nextInt();
	 		System.out.printf("Enter score subject%d%n",(counter1 + 1));
	 		int scoreCollect = input.nextInt(); 			
			studentData[count1][counter1] = scoreCollect;
			totalScore += scoreCollect;
			average += totalScore / scoreCollect;


	System.out.println("saving >>>>>>>>>>>>>>>>>> \n saved successfully");  

          }

     }
	totalStudentScore[count1] = totalScore;
	totalScore = 0;
	averageScore[count1] = average; 
        average = 0;
} 


System.out.println("==================================");
System.out.println("\n===============================================================================");

System.out.printf("Student\t");
System.out.print("Student\t\t");

for (int b= 0; b < studentData.length; b++) {

	System.out.printf("SUB\t\t","%-2s" ,(b+1));
	System.out.printf("SUB\t",(b + 1));
       }

System.out.println("===================================\n\n");
       System.out.print("TOT\tAVG\tPOS");
System.out.println("\n================================================================================");

	for(int count = 0; count < studentData.length; count++) {
            System.out.printf("student%d\t", count +1);

	for(int counter = 0; counter < studentData.length; counter++) {

          System.out.println(studentData[count][counter] + "   ");
          System.out.print(studentData[count][counter] +  " \t  ");

	  }
      }
	System.out.print(totalStudentScore[count]); 
	System.out.println();
      System.out.println(averageScore[count] + "\t\t" );
	System.out.println();                   
	}



}
 }


		
