import java.util.Scanner;
import java.util.Arrays;

public class MBTI{

	public static void main(String[]  args){
 		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name  ");
		String name = input.nextLine();
		int countA = 0;
		int countB = 0;
		int countA1 =0;
		int countA2 =0;
		int countA3 =0;
		int countB1 =0;
		int countB2 =0;
		int countB3 

	String[][]questionian = {
		{"A. expend energy group"},	   {"B.conserve energy,enjoy one-on-one"},
		{"A. more outgoing,think out loud"}, {"B.more reserved,thing to yourself"},
		{"A. seek many tasks, public activities,interaction with others"}, {"B.seek private, solitary 			activities with quiet to concentrate"},
		{"A. external; communicative, express yourself"}, {"B. internal,reticent, keep to yourself"},
		{"A. active, initiate"} , {"B. reflective, deliberate"}
		};

                 String [] answers = new String[questionian.length/2];
                 System.out.println(Arrays.toString(answers));
                  int count = 0;
		for (int counter = 0; counter < questionian.length; counter+=2){
                      for(int nums = 0; nums < questionian[counter].length; nums++){
                        System.out.println(questionian[counter][nums] + " " + questionian[counter + 1][nums]);
			String reply = input.next();
			if (reply.equalsIgnoreCase("A")){
                             answers[count] = reply + " " + questionian[counter][nums];
                              count++;		
			}
                      if (reply.equalsIgnoreCase("B")){
                            answers[count] = reply + " " + questionian[counter +1][nums];
                                 count++;

				}	
                     }
                    System.out.println(Arrays.toString(answers));
		}


	String []questionianTwo = {
		"A.Interpret literally,  B.look for meaning and possibilities",
		"A.practical, realistic, frank, B.imaginative, innovation, theoretical",
      		"A.standard, usual, conventional, B.different,novel,unique",
		"A.focus on here-and-now,  B.look to the future,global perspective,big picture",
		"A.facts, things, what is, B.ideas,dreams, what could be, philosophical"
		};

		for(String retriveResponseTwo : questionianTwo){
			System.out.println(retriveResponseTwo);
			char reply = input.next().charAt(0);
				if(reply == 'A' || reply == 'a'){
					countA1++;
				     }	
				if(reply == 'B' || reply == 'b'){
				       countB1++;
	                          }
	}			

			System.out.println("Number of A selected is :" +countA1++);
			System.out.println("Number of B slected is :" + countB1++);



	String []questionianThree = {
		"A.logical, thinking,questioning, B.empathetic, feeling, accommodating",
		"A.candid, straight forword,frank B. tactful, kind, encouraging",
		"A.firm,tend,to,criticize,hold the line, B.gentile, tend to appreciate, conciliate",
		"A. tough-minded, just B.tender-hearted.marciful",
		"A.mater of fact, issue-oriented, B.sensitive, people-oriented, compassionate"
		};

		for( String retriveResponseThree : questionianThree){
			System.out.println(retriveResponseThree);
			char reply = input.next().charAt(0);
				if (reply == 'A' || reply == 'a'){
     		 			countA2++;
					}
				if (reply == 'B' || reply == 'b'){
		 			countB2++;
                                       }

			}		
			System.out.println("Number of A selected is :" +countA2++);
			System.out.println("Number of B slected is :" + countB2++);



	

	String []questionianfour = {
		"A.organized,orderly,  B.flexible, adaptable",
		"A.plan, schedule   B. unplanned, spontaneous",
		"A.regulated, structured, B.essy-going,live and let live",
		"A.preparation, plan ahead, B.go with the flow adapt as you go",
		"A.control, govern,  B.latitude, freedom"
	}; 

		for( String retriveResponsefour : questionianfour){
			System.out.println(retriveResponsefour);
			char reply = input.next().charAt(0);
				if (reply == 'A' || reply =='a'){
     					 countA3++;
					}
				if (reply == 'B' ||reply == 'b'){
		 			countB3++;
					}


		 	}		

			System.out.println("Number of A selected is :" +countA3++);
			System.out.println("Number of B slected is :" + countB3++);






	}
}

