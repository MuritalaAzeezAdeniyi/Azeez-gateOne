
import java.util.Scanner;
public class TaskNew {
  public static void main(String[] arg){
	Scanner input = new Scanner(System.in);

	int[] array = new int[10];
	for(int count = 0;count < 10; count++){
	System.out.print("Enter score: ");
	array[count] = input.nextInt();
	}                                      
	 for(int count = 9;count >= 0; count--){
          System.out.print(array[count]+" ");
    }












}
}










