# Ch. 5 Challenge 3: Conversion Program

## Mission Briefing

We're mining on the Moon with a European team, and there's one problem: they measure in the metric system. Your program asks for a distance in meters, then shows a menu for converting it to kilometers, inches, or feet. It keeps showing the menu until the user quits. Each conversion lives in its own small method, so `main` only reads input, shows the menu, and calls the right method.

## What You'll Practice

- Breaking a program into small methods with one job each (Day 3 notes, FD1)
- Value-returning methods that take an `int` and send back a `double` (Day 2 notes, R2)
- A `void` method with no parameters (Day 1 notes, M1)
- A `while` loop that repeats a menu, and a validation loop (Chapter 4)

## Starter Code

Edit `src/ConversionProgram.java`. The class is `ConversionProgram`. Do not rename the file or the class.

Comments above `main` describe the four methods to write: `menu`, `calcKilometers`, `calcInches`, and `calcFeet`. Write each method under its comment. The comments in `main` list its steps in order.

## Inputs

| Order | What it is | Java type |
|---|---|---|
| 1 | The distance in meters | `int` |
| 2, 3, ... | A menu choice, read again after each conversion | `int` |

## Rules

### 1. The conversions

Each conversion is its own method. It accepts the meters as an `int` argument and returns the result as a `double`.

| Method | Formula |
|---|---|
| `calcKilometers` | `kilometers = meters * 0.001` |
| `calcInches` | `inches = meters * 39.37` |
| `calcFeet` | `feet = meters * 3.281` |

### 2. The menu

`menu` displays the four options and nothing else. It takes no arguments and returns nothing (`void`).

### 3. Repeat until the user quits

After each conversion, show the menu again and ask for another choice.

- A choice other than `1`, `2`, `3`, or `4`: print the invalid-selection message and read the choice again, as many times as needed.
- Choice `4`: print the goodbye message, then end the program with `System.exit(0);`.

## What to Use

These are suggestions. Any approach that produces the correct output earns full credit, as long as it passes the source checks (see How It's Checked).

- The headers: `public static double calcKilometers(int meters)`, and the same shape for `calcInches` and `calcFeet`; `public static void menu()`.
- A conversion line can use the return value directly: `System.out.println(meters + " meters is " + calcFeet(meters) + " feet.");` (R2 pattern).
- A `while (choice != 4)` loop around the menu, and inside it a validation loop: `while (choice < 1 || choice > 4)` (Chapter 4 Day 1 notes, E7).
- A `switch` on the choice (Chapter 3), or an `if`/`else if` chain.

## Exact Output

Spelling, capitalization, and punctuation must match. The user types each value on the same line as its prompt.

The distance prompt:

```
Enter a distance in meters: 
```

The menu, in this order:

```
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program
```

The choice prompt, and the message for an invalid choice:

```
Enter your choice: 
Invalid selection. Enter your choice: 
```

The three conversion results:

```
[meters] meters is [kilometers] kilometers.
[meters] meters is [inches] inches.
[meters] meters is [feet] feet.
```

The goodbye message:

```
Thank you. Have a nice day!
```

The results print as Java `double` values, so 500 meters is `0.5` kilometers and `19685.0` inches.

## Sample Runs

```text
Enter a distance in meters: 500
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program

Enter your choice: 1
500 meters is 0.5 kilometers.

1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program

Enter your choice: 3
500 meters is 1640.5 feet.

1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program

Enter your choice: 4
Thank you. Have a nice day!
```

An invalid choice:

```text
Enter a distance in meters: 500
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program

Enter your choice: 9
Invalid selection. Enter your choice: 2
500 meters is 19685.0 inches.

1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program

Enter your choice: 4
Thank you. Have a nice day!
```

The blank lines around the menu are optional.

## Test Your Program

Run each test before you submit. The autograder uses these and other values.

| Meters | Choices | Line to look for |
|---|---|---|
| `500` | `1`, then `4` | `500 meters is 0.5 kilometers.` |
| `500` | `2`, then `4` | `500 meters is 19685.0 inches.` |
| `500` | `3`, then `4` | `500 meters is 1640.5 feet.` |
| `250` | `1`, then `4` | `250 meters is 0.25 kilometers.` |
| `1000` | `3`, then `4` | `1000 meters is 3281.0 feet.` |
| `500` | `9`, then `4` | `Invalid selection. Enter your choice:` |
| `500` | `1`, `2`, `3`, then `4` | `Thank you. Have a nice day!` |

## How It's Checked

| Check | What it looks for | Points |
|---|---|---|
| Distance prompt | `Enter a distance in meters:` | 1 |
| Menu | All four options, in order | 2 |
| Kilometers | `500 meters is 0.5 kilometers.` | 3 |
| Inches | `500 meters is 19685.0 inches.` | 3 |
| Feet | `500 meters is 1640.5 feet.` | 3 |
| Kilometers, new value | `250 meters is 0.25 kilometers.` | 2 |
| Feet, new value | `1000 meters is 3281.0 feet.` | 2 |
| Invalid choice | The invalid-selection message after a `9` | 2 |
| Several conversions | `1`, `2`, `3`, then `4` ends with the goodbye message | 2 |
| Uses a `Scanner` | The source code creates a `Scanner` with `System.in` | 1 |
| Uses a `while` loop | The source code has a `while` loop | 1 |
| `menu` method | The source code defines and calls `menu()` | 1 |
| Conversion methods | The source code declares `double calcKilometers(`, `double calcInches(`, and `double calcFeet(` | 1 |
| Ends the program | The source code calls `System.exit` | 1 |
| **Total** | | **25** |

Any approach that produces the correct output earns full credit, as long as it passes the source checks. Results must come from the user's input; the tests use distances you have not seen.

## Where to Look

- Day 3 notes, FD1 (One task per method): one method for each step, with `main` calling them in order.
- Day 2 notes, R2 (Using a return value): using a return value directly inside `println`.
- Day 1 notes, M1 (Header, body, and call): a `void` method with no parameters.
- Rule 3 above: what happens after each choice.
