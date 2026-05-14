#collect for both players
#comapare players from the question
#save and print.
#
playerone = input("Enter: rock ,paper, scissors: ")
playertwo = input("Enter: rock, paper, scissors: ")
if(playerone == playertwo):
    print("TIE")
if(playerone == "rock"):
    if (playertwo == "scissors"):
        print("Playerone wins!!") 
else:
    print("Playertwo wins")            
