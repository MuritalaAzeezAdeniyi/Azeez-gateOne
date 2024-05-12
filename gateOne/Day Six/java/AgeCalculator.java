import java.time.Year;
import java.time.localDate;
Public class AgeCalculator{

public static String getDateOfBirth(DateOfBirth){
String userInput = DateOfBirth;
string theDay = userInput,substring(0,2);
	int birthDays = integer.parseInt(theDay);
	String birthmonth = userinput.substring(2,4);
	
	int birthMonth = integer.parseInt(month);
	String years = integer.parseInt(4,8);
	
	int BirthYear = integer.parseInt(years);
        Year todayYear = Year.now();
        
	int currentyear = todayYear.getValue(); 
	int currentMonth = getMonthvalue();
	int currentDay = month.getDayOfMonth();
        
if(currentMonth < birthMonth && currentDay < birthDays){
   	int age = currentYear - birthYear -1;
	}	

else{
	int age = currentYear - birthYear;	
	}

 return getDateOfBirth;
	
	}

}