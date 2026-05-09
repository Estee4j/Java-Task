score_one = int(input("Enter the first score: "))
score_two = int(input("Enter the second score: "))
score_three = int(input("Enter the second score: "))

total_score = score_one + score_two + score_three / 3

if (total_score >= 90):
    print("A")
    
elif (total_score >= 80):
    print("B")
    
elif (total_score >= 70):
    print("C")
    
elif (total_score >= 60):
    print("D")
    
else:
    print("F")
