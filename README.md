# financial-calculator
Calculator to help simulate profit after given years, with sources of income and expenses

2 main files: 

ApplicationWindow.java is the file that runs the GUI and user interface

DataStorage.java is the file that runs the calculations for income and expenses, also sums the total.


Pages are controlled by a system of JPanel objects that appear and disappear using a helper function switchPages that takes two panel parameters (to and from) and sets the visibility attribute of 'to' to True and 'from' to False. 

Transaction data is stored in a static ArrayList that is updated every time the user inputs an expense or a source of income.

The function sum sums up all of the sources of income and expenses in the 'transactions' ArrayList

The final String message that is displayed to the user is formmated by the function giveResult in DataStorage.java
