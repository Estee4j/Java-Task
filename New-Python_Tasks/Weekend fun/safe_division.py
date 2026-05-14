#collect input
#save result and print.

numberone = float(input("Enter first number: "))
numbertwo = float(input("Enter second number: "))

if numbertwo != 0:
    print(numberone / numbertwo)
    
elif numbertwo == 0:
    print("Cannot divide by zero")
