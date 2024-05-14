import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBook{
        public static void main(String  args){
	ArrayList<String> name = new ArrayList<String>();
	ArrayList<Integer>number= new ArrayList<Integer>();
	Scanner input = new Scanner(System.in);
	String response="";	
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
System.out.print("Add contact");
case 2: 
System.out.print("Remove contact");
case 3:
System.out.print("Find contact by phone number");
case 4: 
System.out.print("Find contact by first name");
case 5:
System.out.print("Find contact by last name");
case 6: 
System.out.print("Edit contact"); 		
}
  name.add("contactName");
  number.add(contactNumber);
do{
System.out.print("Enter name");
String contactName = input.next();

System.out.print("Enter number");
 int contactNumber = input.nextInt();

System.out.print("Add more contact(yes or no)");
response = input.next();

}while(response.equalsIgnoreCase("no"));
 System.out.println(name);
 System.out.println(number);

//public void remove_contact(String name);
//if(this.phoneBook.containsKey(name)) 






}



}