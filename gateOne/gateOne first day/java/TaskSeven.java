import java.util.Scanner;
public class TaskSeven{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in); 
    	double average = 0;
   	int sumTotal = 0;
	int sum = 0;
 for(int count = 1; count <= 10;count++){
	System.out.print("Enter scores: ");
 	int score = input.nextInt();	
	 if(score % 2 == 0){	
             sum++; 
          sumTotal = sumTotal + sum;

	average = sumTotal / score;
		}
	}
        System.out.println(" Total is:" +sumTotal);
	 System.out.println(" Average is:" + average);
	

}




}