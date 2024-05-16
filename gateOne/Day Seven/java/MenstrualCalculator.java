import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class MenstrualCalculator{
	
	public static void main(String[]  args){ 

		Scanner input = new Scanner(System.in);

System.out.println("Welcome to Abdulazeez Menstrual Cycle Calculator! We're happy to help you track your cycle and stay informed about your body, Let's get started and help you better understand your cycle.");


System.out.print("Enter The Date of your last Menstrual flow (DD/MM/YYYY): ");
String dateOfLastFlow = input.nextLine();

System.out.print("Enter The Average Length of your Cycle In Day: ");
int lengthOfCycle = input.nextInt();

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

LocalDate LastFlow = LocalDate.parse(dateOfLastFlow,formatter);

LocalDate nextMenstrual =LastFlow.plusDays(lengthOfCycle);

System.out.println("Your Next Menstrual will starts On: " + nextMenstrual);

LocalDate ovulationDate = nextMenstrual.minusDays(14);

System.out.println("Your ovulation Date Is: " + ovulationDate);

LocalDate fertilePriodSter = ovulationDate.minusDays(7);

LocalDate fertilePriodEnd = ovulationDate.plusDays(2);

System.out.println("Your fertile period is Between: "+ ovulationDate.minusDays(7)+" - " + ovulationDate.plusDays(2));

LocalDate safePeriodStart = ovulationDate.plusDays(5);

LocalDate SafePeriodEnd = nextMenstrual.minusDays(5);

System.out.println("Your safe period is Between " + ovulationDate.plusDays(5)+ " -" + nextMenstrual.minusDays(5) );






}
}