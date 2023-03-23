def addition(a, b):
	return a + b

def tri_area(a: int, b: int) -> int:
	if( a <= 0 or b <= 0):
		raise Exception("Arguments must be postive values greater than 0.")
	else:
		return round((a * b) / 2)

def challengeOne():
	try:
		a = int(input("Enter the first number: "))
		b = int(input("Enter the second number: "))
		print(f'{a} + {b} = {addition(a,b)}')
	except ValueError:
		print('Invalid arguments. Only integers are accepted.')


def challengeTwo():
	try:
		a = int(input("Enter the base: "))
		b = int(input("Enter the height: "))
		print(f'area = {tri_area(a,b)}')
	except ValueError:
		print('Invalid arguments. Only integers are accepted.')
	
if __name__ == "__main__":
	challengeOne()
	challengeTwo()
	