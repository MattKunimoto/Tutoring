# Example program for demonstrating while loops, feel free to play around with and
# edit things and see if the output changes the way you expect it to.

numInputs = input("Enter number of inputs: ")
# Setting numInput equal to whatever number the user gives.

numInputs = int(numInputs)

count = 0
# Variable used to increment each loop cycle.

wordList = []
# Empty list for storing words.

while count < numInputs:	
# Number of loop cycles is determined by user's initial input.
# This is a common condition you will see for while loops.
	newWord = input("Enter new word: ")
	wordList.append(newWord)
	# Ask user for a word and add it to our word list.
	count += 1
	# INCREMENTING COUNT IS IMPORTANT.
	# Without this, the while loop will go on forever.


print(wordList)
# Check what our final list looks like. Feel free to add print statements at points
# in your program.