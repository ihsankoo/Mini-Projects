import random

while True:

    game_elements = ["Rock", "Paper", "Scissor"]
    
    player_choice = None
    computer_choice = random.choice(game_elements)
    
    while player_choice not in ["P", "R", "S", "p", "r", "s"]:
        player_choice = input("Rock, paper or scissor? Type (R), (P) or (S)")

    if player_choice.capitalize() == "R":
        if computer_choice == "Rock":
            print("Your choice: Rock"+
                  "\nComputer's choice: Rock"+
                  "\nTie!")
        if computer_choice == "Paper":
            print('''Your choice: Rock
                     Computer's choice: Paper
                     Computer Won!''')
        if computer_choice == "Scissor":
            print('''Your choice: Rock
                     Computer's choice: Scissor
                     You Won!''')
    elif player_choice.capitalize() == "P":
        if computer_choice == "Rock":
            print('''Your choice: Paper
                     Computer's choice: Rock
                     You Won!''')
        if computer_choice == "Paper":
            print('''Your choice: Paper
                     Computer's choice: Paper
                     Tie!''')
        if computer_choice == "Scissor":
            print('''Your choice: Paper
                     Computer's choice: Scissor
                     Computer Won!''')    
    else:
        if computer_choice == "Rock":
            print('''Your choice: Scissor
                     Computer's choice: Rock
                     Computer Won!''')
        if computer_choice == "Paper":
            print('''Your choice: Scissor
                     Computer's choice: Paper
                     You Won!''')
        if computer_choice == "Scissor":
            print('''Your choice: Scissor
                     Computer's choice: Scissor
                     Tie!''')

    play_again = input("Play again? Type (Y) or (N)")
    if play_again.upper() != "Y":
        break    

print("Bye!")