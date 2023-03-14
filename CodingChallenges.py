def addition(a, b):
	return a + b

def challengeOne():
	try:
		a = int(input("Enter the first number: "))
		b = int(input("Enter the second number: "))
		print(f'{a} + {b} = {addition(a,b)}')
	except ValueError:
		print('Invalid arguments. Only integers are accepted.')



	
if __name__ == "__main__":
	challengeOne()
	