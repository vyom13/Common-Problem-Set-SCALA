# Problem #1: Find theMissing Element
There is an array of non-negative integers. A second array is formed by shuffling the elements of the first array and deleting a random element. Given these two arrays, find which element is missing in the second array. [Linear searching is not allowed].
  
  **Sample Input:**   
Array a = [4, 1, 0, 2, 9, 6, 8, 7, 5, 3]  
Array b= [4, 6, 7, 2, 1, 0, 8, 3, 9]  
**Output:**   
5

# Problem #2: Check Balanced Parentheses
Given a string of opening and closing parentheses, check whether it’s balanced. We have 3 types of parentheses: round brackets: (), square brackets: [], and curly brackets:{}. Assume that the string doesn’t contain any other character than these, no spaces words or numbers. Just to remind, balanced parentheses require every opening parenthesis to be closed in the reverse order opened.  

**Sample Input:**  
({[]})  

**Output:**   
YES  

**Sample Input:**  
([)]  

**Output:**   
NO  

# Problem #3: Permutations 
Generate all permutations of a given string.   

**Sample Input:**  
abc  

**Output:**   
abc  
acb  
bac  
bca  
cab  
cba  

# Problem #4: File I/O 
You will read a text file. Then create another text file containing only the number of words in the first file.  

**Example:**  
Say input file is input.txt, and it contains the following two lines:  

*This is a test program.*  
*I am counting only words.*  

**Output:**   
Say, the created file is output.txt, and it contains:  
10

# Problem #5: Three-of-a-crime
Three-of-a-crime is a simple logic game for up to 3 players. There are 7 different criminals. The computer randomly chooses three of these (the "perpetrators"), but doesn't tell the players which are chosen. The computer then puts down three random criminals. 0, 1, or 2 of these may be the actual perpetrators. The computer also tells the player how many (but not which) of the three criminals are perpetrators. The players may either guess which three criminals are the actual perpetrators or they may pass. If a player guesses wrong, she is out of the game and the other players continue. If no player chooses to guess, the computer puts down another three randomly chosen criminals (0, 1, or 2 of which may be actual perpetrators) and tells the players how many (but not which) of these are actual perpetrators. Players can again use logic to deduce the three actual criminals and may guess. Play continues until some player guesses correctly or until all players have guessed incorrectly.  
An example play:  
Assume the criminals are called "a", "b", "c", "d", "e", "f", and "g". The computer chooses three of these randomly, say "b", "f" and "g". These criminals are the actual perpetrators. The computer does not reveal this to the players.  
Now the computer chooses three criminals randomly and displays them to the players. Say "a", "d", and "f" are chosen and displayed. The computer also tells the players that 1 of these criminals is an actual perpetrator.The players may guess who the actual three perpetrators are. Of course, at this point it's not possible to deduce who the actual perpetrators are, so no player should guess.  
Since no player guessed, the computer again chooses three criminals randomly and reveals them to the players. Say "a", "b", and "f". Thecomputer tells the players that two of these criminals are actual perpetrators, but does not reveal which ones are the real perpetrators.  
Using logic, the players try to deduce who the actual three perpetrators are.  
Etc.  

Your program should be visual if possible with your language. Only if your language does not support GUI interactions may you use a text based interface.
