import java.util.Scanner;
public class TaskFour{
	public static void main(String[] args){

Scanner input = new Scanner(System.in); 
    double average = 0;
   int sum = 0;
 for(int count = 1; count <= 10; count=count+2){
	System.out.print("Enter scores: ");
 	int score = input.nextInt();	
		sum += score[count];

		}
        System.out.println(" sum is:" + sum);
	
}




}