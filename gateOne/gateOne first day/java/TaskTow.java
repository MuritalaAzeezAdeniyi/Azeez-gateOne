import java.util.Scanner;
public class TaskTwo{
	public static void main(String[] args){

Scanner input = new Scanner(System.in); 

   int sum = 0;
 for(int count = 1; count <= 10; count++){
	System.out.print("Enter scores: ");
 	int score = input.nextInt();	
		sum += score;
 	
		}
     System.out.println(sum);
}




}