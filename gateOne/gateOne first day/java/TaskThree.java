import java.util.Scanner;
public class TaskThree{
	public static void main(String[] args){

Scanner input = new Scanner(System.in); 
    double average = 0;
   int sum = 0;
 for(int count = 1; count <= 10; count++){
	System.out.print("Enter scores: ");
 	int score = input.nextInt();	
		sum += score;
 		average = sum / 10;
		}
        System.out.println(" sum is:" + sum);
	System.out.println("Average is :" + average);
}




}