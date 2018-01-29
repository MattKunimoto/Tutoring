
def toNumbers(convertList):
# IN: List of grades as strings
# MODIFY: Converts the strings in the list to integer numbers
	parse = 0
	while parse < len(convertList):
		convertList[parse] = int(convertList[parse])
		parse += 1

def sumlist(numList):
# IN: List of numbers
# OUT: Sum of the numbers in the list
	total = 0
	parse = 0
	while parse < len(numList):
		total += numList[parse]
		parse += 1
	return total

# Open the file and scan its contents.
filepath = 'grades.txt'
fp = open(filepath)
scan = fp.read()
fp.close()

# Initializing variables to be used in our loop
num = ''
line = []
gradeList=[]	# Will hold our filtered list of grades
trace = 0


while trace < len(scan):
# This while loop will go through every character scanned from the file
# one-by-one and filter it into lists of integer number grades.

	while trace < len(scan) and scan[trace].isdigit():
	# Nested loop to log each new number
		num += scan[trace]		
		trace += 1
	
	if trace >= len(scan) or scan[trace] == '\n':
	# New line or end of file case.
	# Append the completed number to the indivudal line list,
	# then add the completed line to our full list of grades.
	# NOTE: It's important that 'trace >= len(scan)' is on the left side of this
	# 'or' statement, and at the beginning of this if/elif/else statement.
	# Try putting it anywhere else to see why.
		line.append(num)
		toNumbers(line)
		gradeList.append(line)
		num = ''
		line = []	
	elif scan[trace] == ',':
	# Commas signal the end of a number.
	# Append the complete number to the individual line list.
		line.append(num)
		num = ''
	else:
	# In case the file has unexpected characters, print an error warning.
		print("ERROR: UNEXPECTED CHARACTER {}".format(scan[trace]))

	trace += 1


trace = 0
while trace < len(gradeList):
# Print out the averages of the grades stored in gradeList
	avg = sumlist(gradeList[trace])
	numValues = len(gradeList[trace])
	print("average = {:6.2f}".format(avg/numValues))
	# {:6.2f} means that the value will be printed as a float
	# with a fixed width of 6 and 2 decimal points
	trace += 1