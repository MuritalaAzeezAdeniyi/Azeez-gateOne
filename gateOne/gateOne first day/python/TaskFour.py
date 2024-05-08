
total = 0
for number in range(10):
	score = int(input('Enter number: '))
	if score % 2 ==0:
		total= total + score
	
print(" The average of number is:", total)
