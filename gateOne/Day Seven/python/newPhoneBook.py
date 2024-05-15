

contacts = []
sentinel_value = "yes"
condition = 1
while True:
	prompt = """
	1 <- Add contact
	2 <- Remove contact
	3 <- Find contact by phone number
	4 <- Find contact by first name
	5 <- Find contact by last name
	6 <- exit 
	"""
print(prompt)
phoneBook = int(input("Enter options "))
match(phoneBook):
	case 1:   
		if sentinel_value == "yes":
			firstName = input("Enter first name: ")
			lastName = input("Enter last name: ")
			phoneNumber = input("Enter contact number: ")
			contacts.append([firstName,lastName,phoneNumber])
			sentinel_value = input("Add more contact(yes or no): ") 
			print(contact)
	
	case 2: 
 		number = input("Enter number")
		for number in contacts:

	case_:	
		return
		
		
