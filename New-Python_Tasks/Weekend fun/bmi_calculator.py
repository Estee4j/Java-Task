#collect input
#because it's  decimal, you use float
#save and print result.
#

weight = float(input("Enter weight: "))
height = float(input("Enter height: "))

bmi = weight / (height * height)

if bmi < 18.5:
    print("underweight")
    
elif bmi >= 18.5 and bmi <= 24.9:
    print("Normal")
    
elif bmi >= 25 and bmi <= 29.9:
    print("Overweight")
    
else:
    print("Obese")
