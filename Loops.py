
numInputs = input("Enter number of inputs: ")

numInputs = int(numInputs)

count = 0

wordList = []

while count < numInputs:
	newWord = input("Enter new word: ")
	wordList.append(newWord)
	count += 1


print(wordList)