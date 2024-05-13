import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBook{
        public static void main(String  args){
	ArrayList<String> name = new ArrayList<String>();
	ArrayList<Double>number= new ArrayList<Double>();
	Scanner input = new Scanner(System.in);
		
 String prompt = """
1 Add contact; 
2 Remove contact;
3 Find contact by phone number;
4 Find contact by first name;
5 Find contact by last name;
6 Edit contact;
""";
 System.out.print(prompt)
int phoneBook = input.nextInt
Switch(phoneBook){
1-> Add contact;
2-> Remove contact;
3-> Find contact by phone number;
4-> Find contact by first name;
5-> Find contact by last name;
6-> Edit contact; 		
}
 
do{
System.out.print("Enter name");
String name = input.nextline();

System.out.print("Enter number");
int number = input.nextInt();

}while (name.qualsIgnoreCase("yes"));



}



}