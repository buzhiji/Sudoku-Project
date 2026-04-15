# Sudoku-Project

My name is Bingchen Wu. 

This is a typical 9x9 sudoku board where each row, each column, each 3x3 sub grid contains a list of 1 - 9 without repeating.
My code creates a typical 9x9 sudoku board where each row, each column, each 3x3 sub grid contains a list of 1 - 9 without repeating. First of all I set up a 2d array where it is 9 by 9. Then I have the method which shuffles my array of 1 - 9 for the first column so I have a random sudoku every time. Then based on the first row I generated I used a math equation that I proved to refer back to what number in the first column would be a fittable number for the current position in the board. With a nested for loop that repeats for the whole board it would successfully create a 2d array list with proper numbers in each spot. Then I have the final method which prints out the board nicely. In the main I first generate the board and then print it out nicely to create the 9x9 sudoku.

There are few files. One is sudoku with recursion which is document explanation for sudoku using recursion. The other one is sudoku without recursion which document explaning how my code work sudoku using a pattern I recognized in the sample output. The next one is MyProgram which is the java code for sudoku without recursion. Myprogram1 would be java code for sudoku with recursion.

In order to run you you copy paste the code into Java compiler like code hs and create a new java main and copy paste the code in. Then you click run and it would work.
