We've been working on a project with the Europeans to do some mining on the moon. There's just one problem: they use the Metric system. We need a way to quickly convert between their measurements and our measurements.

The program should ask the user to enter a distance in meters. Once the user has entered the distance the program should display the following menu of options for conversion:
>   1. Convert to kilometers
>   2. Convert to inches
>   3. Convert to feet
>   4. Quit the program

The program should then convert the distance to kilometers, inches, or feet depending on the user's selection. Here are the specific requirements.

- Write a double returning method named calcKilometers, which accepts the number of meters as an argument. The method should return the argument converted to kilometers Convert the meters to kilometers using the following formula:
  `kilometers = meters * 0.001`

- Write a double returning method named calcInches, which accepts the number of meters as an argument. The method should return the argument converted to inches. Convert the meters to inches using the following formula:
  `inches = meters * 39.37`

- Write a double returning method named calcFeet, which accepts the number of meters as an argument. The method should return the argument converted to feet. Convert the meters to feet using the following formula:
  `feet = meters * 3.281`

- Write a void returning method named menu that displays the menu of the selections. This method should not accept any arguments.

- The program should continue to display the menu until the user enters 4 to quit the program using a loop.

- If the user selects an invalid choice from the menu, the program should display an error message that reads:
> Invalid selection. Enter your choice: 

Here is an example session with the program, using console input. The user's input is indicated as (1).


> Enter a distance in meters: `[500]`
> 1. Convert to kilometers
> 2. Convert to inches
> 3. Convert to feet
> 4. Quit the program
> 
> Enter your choice: `[1]`
> 500 meters is 0.5 kilometers.
> 
> 1. Convert to kilometers
> 2. Convert to inches
> 3. Convert to feet
> 4. Quit the program
> 
> Enter your choice: `[3]`
> 500 meters is 1640.5 feet
> 
> 1. Convert to kilometers
> 2. Convert to inches
> 3. Convert to feet
> 4. Quit the program
> 
> Enter your choice: `[4]`
> Thank you. Have a nice day!

Things you need to pass the tests:
> Request 1 - "Enter a distance in meters: "
> Request 2 - "Enter your choice: "
> Request Invalid - "Invalid selection. Enter your choice: "
> When quit - "Thank you. Have a nice day!"
> Output for km - "`[meters]` meters is `[kilometers]` kilometers."
> Output for in - "`[meters]` meters is `[inches]` inches."
> Output for ft - "`[meters]` meters is `[feet]` feet."
> Prompt 1-1 - "1. Convert to kilometers"
> Prompt 1-2 - "2. Convert to inches"
> Prompt 1-3 - "3. Convert to feet"
> Prompt 1-4 - "4. Quit the program"
