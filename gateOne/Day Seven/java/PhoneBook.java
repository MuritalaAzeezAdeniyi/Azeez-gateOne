import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBook{
        
	static ArrayList<String>name=new ArrayList<String>();
	static ArrayList<String>lastName = new ArrayList<String>();
	static ArrayList<String>number=new ArrayList<String>();
	Scanner input = new Scanner(System.in);
	


public static void main(String[]  args){	
       
phoneBookMenu();
}

public static void phoneBookMenu(){
String prompt = """
====================================================================
Hi welcome to Stroggle Abdulazeez phonebook app,select any option to perform.  
1 <- Add contact 
2 <- Remove contact
3 <-Find contact by phone number
4 <-Find contact by first name         
5 <-Find contact by last name
6 <-Edit contact
0 <- exit
===================================================================
""";
Scanner input = new Scanner(System.in);
	
System.out.print(prompt);
int phoneBook = input.nextInt();

switch(phoneBook){
case 1-> addContact();   
case 2-> removeContact();
case 3-> findContactByPhonenumber();
case 4-> findContactByFirstName();
case 5-> findContactByLastName();
//case 6-> Edit contact();
}
 	}

public static void addContact(){

Scanner input = new Scanner(System.in);

System.out.println("Enter first name");
String contactName = input.next();
name.add(contactName);

System.out.print("Enter last name");
 String secondName = input.next();
 lastName.add(secondName);

System.out.println("Enter number");
 String contactNumber = input.next();
 number.add(contactNumber);
	addAnotherCountact();
phoneBookMenu();
}

public static void addAnotherCountact(){

Scanner input = new Scanner(System.in);
	
System.out.println("Add more contact(yes or no)");
String response = input.next();
  
if(response.equalsIgnoreCase("yes")){
	addContact();
	}
else{
System.out.println("Contacts added Succeesuflly>>>>>>>>>>>>>>>>>>>");

}
phoneBookMenu();    
}
 
public static void removeContact(){

Scanner input = new Scanner(System.in);
	

System.out.println("Enter  number");
 String compare = input.next();
for(int count = 0; count < number.size();count++){
	
	  if(number.get(count).equals(compare )){
	   number.remove(number);
           //System.out.println(number);
	   }   
      
	if(!(number.get(count).equals(compare))){
	System.out.println("contact not found");
	}	
} 
phoneBookMenu();    
}

public static void findContactByPhonenumber(){
Scanner input = new Scanner(System.in);
	
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
phoneBookMenu();    

}
public static void findContactByFirstName(){

Scanner input = new Scanner(System.in);
	
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
phoneBookMenu(); 
}

public static void findContactByLastName(){

Scanner input = new Scanner(System.in);
	

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
phoneBookMenu(); 
}

}

 //case 6: 
//System.out.println("Enter contact you want to edit");
 //String editNumber = input.next();
//for(int count = 0; count < number.size();count++){
//System.out.println(number.get(count) +" - "+editNumber);
 //}









  






//}
 
//}



//}