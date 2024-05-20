firstName = []
lastName = []
contactNumber = []
while True:
    prompt = """
1 <- Add contact
2 <- Remove contact
3 <- Find contact by phone number
4 <- Find contact by first name
5 <- Find contact by last name
6 <- Edit contact
"""
    print(prompt)
    phoneBook = int(input("Enter options: "))
    match phoneBook:
        case 1:
            firstName = input("Enter first name: ")
		name.append(firstName)
            secondName = input("Enter last name: ")
		lastName.append(secondName)
            phoneNumber = input("Enter contact number: ")
		contactNumber.append(phoneNumber)
            sentinel_value = input("Add more contact (yes or no): ")
            if sentinel_value.lower() != "yes":
                break
            print(name)
	    print(lastName)
	    print(contactNumber)
      
        case 2:
            number_to_remove = input("Enter number to remove: ")
            for contact in contactNumber:
		if contactNumber != number_to_remove:
            		contactNumber.pop(contact) 
	    		firstName.pop(contact)
			lastName.pop(contact)
		print(contactNumber)
		print(Name)
        	print(lastName)
		
		else:
			print("contact not found")
		
        case 3:
            number_to_find = input("Enter phone number to find: ")
            for contact in contactNumber: 
		if contactNumber == number_to_find:
            		print( contact found)
		else:
			print( contact not found)
        
        case 4:
            first_name_to_find = input("Enter first name to find: ")
            for contact in name: 
		if name.lower() == first_name_to_find.lower():
            		print(contacts found)
		else	
			print(contact not found)
        
        case 5:
            last_name_to_find = input("Enter last name to find: ")
            for contact in lastName: 
		if lastName .lower() == last_name_to_find.lower():
            		print(contacts found)
		else:
			print(contact not found)
        
        case 6:
             number_to_edit = input("Enter phone number to find: ")
             for number in contactNumber:
		if contactNumber.lower() ==  number_to_edit.():
			newNumber = input("Enter new number")
			newName = input("Enter new first name")
			newLastName = input("Enter new last name")
        		contactNumber = newNumber
			name = newName
			lastName = newLastName
			print(contactName)
			print(name)
			print(lastName)
		else:
			print(contact not found)

		
       
         