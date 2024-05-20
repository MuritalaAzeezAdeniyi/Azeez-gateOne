const FirstName = [];
const lastName = [];
const contactNumber = [];
const prompt = require("prompt-sync");
let mainMenuOptions=""" =================================================================
1<- Add contact
2 <-Remove contact
3 <- Find contact by phone number
4 <- Find contact by first name
5 <- Find contact by last name
6 <- Edit contact
0 <- exit
================================================================ """);
console.log(mainMenuOptions);
let phoneBook = ("Enter any of option");
swicth(phoneBook){
case 1 -> addCounter();
case 2 -> removeCountact();
case 3 -> findContactByPhoneNumber();
case 4 -> findContactByLastName();
case 5 -> findContactByLastName();
case 6 -> EditContact(); 
}

function addConctact(){
let name = prompt("Enter first name");
firstName.push(name);
let seconName = prompt("Enter last name");
lastName.push(secondName);
let contact = prompt("Enter contact number");
contactName.push(contact)
addAnotherContact()
}

function addAnotherContact(){
let anotherContact =("Add another contact (yes or no)");
if(anotherContact === yes){
      addConctact()
}
else
	System.out.print(contact added successfully >>>>>>>>>>>>);
}

function removeContact(){
	numberOfContactToRemove = ("Enter number to remove");
	for(let count = 0; count < contactNumber.length; count
	if(numberOfContactToRemove[count] === 'contactNumber'){
		contactNumber.pop(count); 
		firstName.pop(count);
		lastName.pop(count);
		console.log(contactName);
		}
 	else{
		console.log("contact not found")
	}
}

function findContactByPhoneNumber(){
let phoneNumber = prompt ("Enter PhoneNumber to find");
for(let count = 0; count < contactNumber.length;count++){
 	if(phoneNumber === contactNumber){
		console.log("contact found");
	else{
		console.log("contact not found");
		}
	
      }
}


function findContactByFirstName(){
	let name = prompt ("Enter first name");
  	for(let count = 0; count < firstName.length;count++){
 		if(firstName === name){
			console.log("contact found");
			}
		else{
			console.log(" contact not found");
			}
         }
  } 

function findContactBylastName(){
	let name = prompt ("Enter sencond name");
	for(let count = 0; count < lastName.length;count++){
		if(lastName === name){
			console.log("contact found");
			}
		else{
			console.log("contact not found");
			}
	}
}

function editContact(){
let phoneNumber = prompt("Enter phone number");
for(let count = 0; count < contactNumber.length; count++){
	if(contactNumber(count) === phoneNumber){
 		let newfirstName = prompt("Enter new first name");
		let newlastName = prompt("Enter new last name");
		let newContactNumber = prompt("Enter new contactnumber");
    
		firstName = newFirstName;
		lastName  = newLastName;
		contactNumber = newContactNumber;
	console.log("contact edit successfully")
		}	

  }
