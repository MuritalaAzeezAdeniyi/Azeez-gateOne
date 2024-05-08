import java.util.Scanner;
public class TaskSix{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in); 
    	double average = 0;
   	int sum = 0;
 for(int count = 1; count <= 10;count++){
	System.out.print("Enter scores: ");
 	int score = input.nextInt();	
	 if(score % 2 == 0){	
             sum++; 
          average = sum / score;
		}
	}
        System.out.println(" Average is:" + average);
	
}




}