#collect input
#use the function len to check letter and count characters in alphabeth
#
letter = input("Enter a letter: ")

if len(letter) == 1:
    if letter in "aeiou":
        print(f"{letter} is a vowel")
        
    else:
        print(f"{letter} is a consonant")
        
else:
    print("Invalid input")
