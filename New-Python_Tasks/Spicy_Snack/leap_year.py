#collect input
#since leap year occurs every 4 years, you divide by 4
#save and print result.

year = int(input("Enter a year: "))

if (year % 4 == 0 and year % 100 != 0):
    print(year, "is a Leap Year")
    
else:
    print(year, "is not a Leap Year")
