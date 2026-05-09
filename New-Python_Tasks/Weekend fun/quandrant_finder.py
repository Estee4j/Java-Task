#collect users input
#save and print
#
first_number = int(input("Enter X: "))
second_number = int(input("Enter Y: "))

if (first_number > 0) and (second_number > 0):
    print("01")

elif (first_number < 0) and (second_number > 0):
    print("02")

elif (first_number < 0) and (second_number < 0):
    print("03")

elif (first_number > 0) and (second_number < 0):
    print("04")
    
elif (first_number == 0) and (second_number == 0):
    print("Origin")

elif (first_number != 0) and (second_number == 0):
    print("X-axis")

elif (first_number == 0) and (second_number != 0):
    print("Y-axis")
    
else:
    print("Invalid input")

