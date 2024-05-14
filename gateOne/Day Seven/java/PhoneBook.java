import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBook{
        public static void main(String[]  args){
	ArrayList<String>name=new ArrayList<String>();
	ArrayList<String>lastName = new ArrayList<String>();
	ArrayList<String>number=new ArrayList<String>();
	Scanner input = new Scanner(System.in);
	String response="";	
        String contactNumber = "";

String prompt = """
1 <- Add contact 
2 <- Remove contact
3 <-Find contact by phone number
4 <-Find contact by first name
5 <-Find contact by last name
6 <-Edit contact
0 <- exit
""";
while (true){
System.out.print(prompt);
int phoneBook = input.nextInt();
switch(phoneBook){
case 1:   
do{
System.out.println("Enter first name");
String contactName = input.next();
 name.add(contactName);
System.out.print("Enter last name");
 String secondName = input.next();
 lastName.add(secondName);
System.out.println("Enter number");
 contactNumber = input.next();
 number.add(contactNumber);
System.out.println("Add more contact(yes or no)");
response = input.next();
}while(response.equalsIgnoreCase("yes"));
 System.out.println(name);
 System.out.println(lastName);
 System.out.println(number);
break;	

case 2:
System.out.println("Enter number");
 String compare = input.next();
for(int count = 0; count < number.size();count++){
	if(number.get(count).equals(compare )){
           System.out.println("number");
	   }   
      
	if(!number.get(count).equals(compare)){
		}System.out.println("contact not found");
	}	
break;
case 3:
System.out.println("Enter phone number");
 String phoneNumber = input.next();
 for(int count = 0; count < number.size();count++){
if(number.get(count).equals(phoneNumber)){
 	System.out.println(number); 
 	}
else{
	System.out.println("contact not found");
 	}
}
break;

case 4:
System.out.println("Enter first name");
String firstName = input.next();
for(int count =0; count < name.size();count++){
	if(name.get(count).equals(firstName)){
		System.out.println(name); 
	   }
          else{
 		System.out.print("contact not found");
              }
 } 
 break;
case 5:
System.out.println("Enter last name");
String getLastName = input.next();
for(int count = 0; count <lastName.size();count++){
	
	if(name.get(count).equals(getLastName)){
	     	System.out.println(lastName); 
	     }

	else{
 		System.out.println("contact not found");
      }

}

break;

case 6: 
System.out.println("Enter contact you want to edit");
 String editNumber = input.next();
for(int count = 0; count < number.size();count++){
System.out.println(number.get(count) +" - "+editNumber);
 }









  




}

}
 
}



}