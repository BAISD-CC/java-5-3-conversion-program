We've been working on a project with the Europeans to do some mining on the moon. There's just one problem: they use the Metric system. We need a way to quickly convert between their measurements and our measurements.

The program should ask the user to enter a distance in meters (store it in an `int` variable). Once the user has entered the distance, the program should display the following menu of options for conversion:
>   1. Convert to kilometers
>   2. Convert to inches
>   3. Convert to feet
>   4. Quit the program

The program should then convert the distance to kilometers, inches, or feet depending on the user's selection. Here are the specific requirements.

- Write a `double`-returning method named `calcKilometers`, which accepts the number of meters as an argument. The method should return the argument converted to kilometers using the following formula:
  `kilometers = meters * 0.001`

- Write a `double`-returning method named `calcInches`, which accepts the number of meters as an argument. The method should return the argument converted to inches using the following formula:
  `inches = meters * 39.37`

- Write a `double`-returning method named `calcFeet`, which accepts the number of meters as an argument. The method should return the argument converted to feet using the following formula:
  `feet = meters * 3.281`

- Write a `void`-returning method named `menu` that displays the menu of selections shown above. This method should not accept any arguments.

- Use a `while` loop so the program keeps displaying the menu and processing selections until the user enters `4` to quit.

- If the user enters anything other than `1`, `2`, `3`, or `4`, the program should display the error message below and ask for their choice again:
> Invalid selection. Enter your choice: 

- When the user selects `4`, the program should print the message below and then end the program (for example, using `System.exit`).
> Thank you. Have a nice day!

## Example session

Here is an example session with the program, using console input. The user's input is shown as `[value]`.

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
> 500 meters is 1640.5 feet.
> 
> 1. Convert to kilometers
> 2. Convert to inches
> 3. Convert to feet
> 4. Quit the program
> 
> Enter your choice: `[4]`
> Thank you. Have a nice day!

## Requirements checklist

Your program will be checked for the following. Wording matters for the messages below — match it exactly.

- Prompt for the distance: `Enter a distance in meters: `
- Prompt for a menu choice: `Enter your choice: `
- Invalid choice message: `Invalid selection. Enter your choice: `
- Quit message: `Thank you. Have a nice day!`
- Kilometers output: `[meters] meters is [kilometers] kilometers.`
- Inches output: `[meters] meters is [inches] inches.`
- Feet output: `[meters] meters is [feet] feet.`
- Menu options, in order:
  - `1. Convert to kilometers`
  - `2. Convert to inches`
  - `3. Convert to feet`
  - `4. Quit the program`

You are expected to use:
- A `Scanner` to read the distance and the menu choice.
- A `while` loop to keep the menu running until the user quits.
- The three conversion methods (`calcKilometers`, `calcInches`, `calcFeet`), each accepting the distance and returning a `double`.
- A `menu` method that displays the four menu options and takes no arguments.
