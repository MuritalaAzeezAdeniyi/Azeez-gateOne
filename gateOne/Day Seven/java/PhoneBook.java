import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBook{
        public static void main(String[]  args){
	ArrayList<String>name = new ArrayList<String>();
	ArrayList<String>number= new ArrayList<String>();
	Scanner input = new Scanner(System.in);
	String response="";	
        String contactNumber = "";
String prompt = """
1 Add contact; 
2 Remove contact;
3 Find contact by phone number;
4 Find contact by first name;
5 Find contact by last name;
6 Edit contact;
""";
 System.out.print(prompt);
int phoneBook = input.nextInt();
switch(phoneBook){
case 1: 
System.out.print("Add contact");break;
case 2: 
System.out.print("Remove contact");break;
case 3:
System.out.print("Find contact by phone number");break;
case 4: 
System.out.print("Find contact by first name");break;
case 5:
System.out.print("Find contact by last name");break;
case 6: 
System.out.print("Edit contact");break; 		
}
 
  
do{
System.out.println("Enter name");
String contactName = input.next();
 name.add(contactName);
System.out.println("Enter number");
 contactNumber = input.next();
  number.add(contactNumber);
System.out.println("Add more contact(yes or no)");
response = input.next();

}while(response.equalsIgnoreCase("yes"));
 System.out.println(name);
 System.out.println(number);








}



}