  This project is called WordFind. The purpose is to help players with their eye scanning abilities to pick out words.
The program generates a 10x10 grid and places a single word from a word bank into the grid randomly. The user is then 
given 3 option words and they have 20 seconds to find the correct word in the grid.

  WordFind works using 3 classes called Main, Grid, and ScramMethods. The Grid class handles the creation of the grid.
It randomly selects a word to be put into the grid, selects the users options, and shuffles them. When working on this
aspect, I kept scalability in mind. I wanted to be able to add more words to the wordBank later on and not have to 
change other numbers. So all random number generators in this section use variables instead of constants. For the 
shuffle feature I created my own shuffle function. Since the array would only be three values, I simply made each 
value move one spot to the left a random amount of times between 5 and 10. This array did not need a complex library 
shuffle solution; I think this one was perfect and does the trick.
  The ScramMethods class actually builds and displays the grid. It can generate a grid with the word placed horizontally 
or the word placed vertically. It first builds a random 10x10 grid, then it chooses a reasonable starting point on the 
grid and inserts the answer word. Again, I built this section with scalability in mind so I could change the size of the 
grid if I wanted to later. I used "final" and variables in place of other raw numbers. I also used limits on the random 
number generator to make sure a word does not go out of bounds.
  Finally, the Main class tied everything together and managed the front end users would play with. To keep track of time, 
I used the currentTimeMillis() function, which requests the local time from the computer. A scanner is used to receive the 
players string input. Also, an else if statement is used to check if the user's guess is correct and within the time limit.
Otherwise, the main class consists mostly of print statements for instructions/aesthetic.
  
**3 "A-ha" moments**

The first "A-ha" moment came during class when we were sharing ideas. Mr. Kiang asked how I would prevent random words
from being generated in the grid that I did not plan on. I couldn't think of any efficient way to do this, so I changed
the rules of my game instead. While this still could be an issue, the odds of a random word being generated that matches
one of the three user options is drastically lower than if the user was just guessing with no options.

At first, I planned on putting the correct answer into the grid first then filling in all the spaces around it. I quickly 
realized this would be difficult and require a lot of extra processing power. I would need to keep track of the original
word and avoid it when filling in the rest of the grid. After awhile, I realized I could flip the process and start by
filling in the array randomly, then inserting the answer. This saved a lot of pain and turned out fine.

Another more frustrating A-ha moment came while trying to build the answer checker. The simple/obvious solution did not 
work, so I started changing where all the variables were stored. I thought a lot about just sending indecies for the 
array and not actual strings. I played with different data types. I even made a getter (which I actually still use for 
one thing). Then, as it still did not work and I could not see why, I realized the string comparison in the if statement
may be wrong. Sure enough, a quick google search showed me that "==" does not work for strings. I must use the .equals()
function. I felt silly after this and reverted back to my original solution, which now worked nicely.
