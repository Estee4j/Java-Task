#collect input
#convert password to len 
#save and print
#

password = input("Enter a password: ")
password = len(password)

if password > 1 and password < 6:
    print("Weak")

elif password >= 6 and password <= 6:
    print("Medium")


elif password >= 10:
    print("Strong")
    
    
if password <= 1:
    print("Invalid")


