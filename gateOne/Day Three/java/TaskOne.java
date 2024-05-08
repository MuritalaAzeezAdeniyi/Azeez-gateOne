import java.util.Random;
import java.util.Scanner;
public class RandomArithmetic{
	public static void main(String[] arg){
	Scanner input = new Scanner(System.in);
	 Random generator = new Random();
	int number = 2;
	int numberTwo = 5;
	int check = number + numberTwo;
 	int userAnswer;
  for(int count = 1 ; count <= 10; count++){
  System.out.println(" What is the answer to" + number +" + " + numberTwo + " = ");
  userAnswer = input.nextInt();
	if(userAnswer == check){
	 System.out.print(correct);
	}
	else{
		Sysem.out.print(incorrect);    
		}
	}
}
  }

                    