from graphics import *  # importing the graphics python library

win = GraphWin("Tictactoe", 500, 500)

# Drawing the tictactoe grid using three rectangles
outerBox = Rectangle(Point(100,100), Point(400,400))
verticalBox = Rectangle(Point(200,100), Point(300,400))
horizontalBox = Rectangle(Point(100,200), Point(400,300))
outerBox.draw(win)
verticalBox.draw(win)
horizontalBox.draw(win)

stillPlaying = True

while(stillPlaying):
	x_coord = -1
	y_coord = -1

	userClick = win.getMouse()	# get mouse click from user

	# determine horizontal location of click on the tictactoe grid
	if(userClick.getX() > 100 and userClick.getX() < 200):
		x_coord = 150
	elif(userClick.getX() > 200 and userClick.getX() < 300):
		x_coord = 250
	elif(userClick.getX() > 300 and userClick.getX() < 400):
		x_coord = 350

	# determine vertical location of click on the tictactoe grid
	if(userClick.getY() > 100 and userClick.getY() < 200):
		y_coord = 150
	elif(userClick.getY() > 200 and userClick.getY() < 300):
		y_coord = 250
	elif(userClick.getY() > 300 and userClick.getY() < 400):
		y_coord = 350

	print("x_coord: ")
	print(x_coord)
	print("y_coord: ")
	print(y_coord)

	# plot X on grid square that was clicked
	if(x_coord > 0 and y_coord > 0):
		newMark = Circle(Point(x_coord, y_coord), 40)
		newMark.draw(win)

# Things to add:
# - implement X markers
# - alternate between marking X's and O's
# - record where has been marked in a two-dimensional array
# - win condition checking


win.getMouse() 	# Pause to view result
win.close() 	# Close window when done