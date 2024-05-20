
	
date = new date
const prompt = require("prompt-sync")();
consolo.log("Welcome to Abdulazeez Menstrual Cycle Calculator! We're happy to help you track your cycle and stay informed about your body, Let's get started and help you better understand your cycle.");

let lastFlowDate =prompt(input("Enter The Date of your last Menstrual flow (DD/MM/YYYY): "));
let cycleLength = input("Enter The Average Length of your Cycle In Day: "

let LastFlow = LocalDate.parse(dateOfLastFlow,formatter);

let nextMenstrual =LastFlow.plusDays(lengthOfCycle);

console.log("Your Next Menstrual will starts On: " + nextMenstrual);

let ovulationDate = nextMenstrual.minusDays(14);

console.log("Your ovulation Date Is: " + ovulationDate);

 let fertilePriodSter = ovulationDate.minusDays(7);

let fertilePriodEnd = ovulationDate.plusDays(2);

console.log("Your fertile period is Between: "+ ovulationDate.minusDays(7)+" - " + ovulationDate.plusDays(2));

let safePeriodStart = ovulationDate.plusDays(5);

let SafePeriodEnd = nextMenstrual.minusDays(5);

console.log("Your safe period is Between " + ovulationDate.plusDays(5)+ " -" + nextMenstrual.minusDays(5) );






}
}