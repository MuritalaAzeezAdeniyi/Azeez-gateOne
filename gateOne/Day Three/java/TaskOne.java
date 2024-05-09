import java.util.Random;
import java.util.Scanner;
public class TaskOne{
	public static void main(String[] arg){
	Scanner input = new Scanner(System.in);
	 Random generator = new Random();
 	int userAnswer;
	int pass = 0;
	int fail = 0;
    //int[] operators ={"+","-","*","/"};
  for(int count = 1 ; count <= 10; count++){
  int numberOne = generator.nextInt(50);
  int numberTwo = generator.nextInt (30);
 //string operator = operator[random.generator(5)];     
  int expectedAnswer = numberOne - numberTwo;
  System.out.println(" What is the answer to  " + numberOne +" - " + numberTwo + " = ");
  userAnswer = input.nextInt();
	if(userAnswer == expectedAnswer){
	 System.out.println("correct");
		pass++;
	}
	else{
		System.out.println("incorrect");    
		       fail++;
	}
}
System.out.println("Total passed is " + pass);
System.out.println ("Total failed is " + fail);
}
  }

                    