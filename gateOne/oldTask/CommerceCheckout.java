import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class CommerceCheckout{CommerceCheckout
public static void main(String[] arg){
Scanner input = new Scanner (System.in);

int counter = 0;
double total = 1;
double howMany = 0;
double perUnit = 0;
double sum = 0;
Date date = new Date();

ArrayList<String> items = new ArrayList<String>();
ArrayList<Double> unit = new ArrayList<Double>();
ArrayList<Double> pieces = new ArrayList<Double>();
ArrayList<Double> totals = new ArrayList<Double>();



System.out.println("what is the customer's name?");
 String customer = input.next();
String response ="";



do {
System.out.println("what did user buy?");
 String userBuy=input.next();

System.out.println("How many pieces?");
howMany = input.nextDouble();
 
System.out.println("How much per unit?");
perUnit = input.nextDouble();

System.out.println("Add more items?");

total = howMany * perUnit;

items.add(userBuy);
unit.add(perUnit);
pieces.add(howMany);
totals.add(total);

 response = input.next();
} while (!response.equals("no"));

System.out.println("what is your name?");
String name = input.next();
System.out.println("How much discount will he get?");
 double discount = input.nextInt(); 
System.out.print("""
                     SEMICOLON STORES
                     MAIN BRANCH
                     LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA LAGOS.
                     TEL: 03293828343
                                         """);
System.out.println(date);
      
System.out.println("cashier:"+ name); 
System.out.println("customer Name:"+ customer);  
System.out.println("===========================================");
System.out.println("\titems\tQTY\tPRICE\tTOTAL(NGN)");
System.out.println("--------------------------------------------");
for(counter = 0; counter < items.size(); counter++) {
sum += totals.get(counter);
System.out.println("\t"+items.get(counter)+ "\t" + pieces.get(counter) + "\t"+ unit.get(counter) +"\t"+totals.get(counter));       
} 

double midDiscount = discount / 100;
double grandDiscount = sum * midDiscount;
double vat = (sum * 17.5) / 100;
double bill = (sum - grandDiscount) + vat;       
System.out.println("------------------------------------------------");
System.out.println("              sub Total: " + sum);
System.out.println("              Discount:  " + grandDiscount           );
System.out.printf("               vat @ 17.50 %2f%n", vat);
System.out.println("=================================================");
System.out.println("              Bill Total: " + bill);  
System.out.println("=================================================");
System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY " + bill);
System.out.println("==================================================");


System.out.print("How much did the customer give to you?");
















 }

}