# Ch. 5 Challenge 3: Conversion Program

## Mission Briefing

We're mining on the Moon with a European team, and there's one problem: they measure in the metric system. The program asks for a distance in meters, then shows a menu for converting it to kilometers, feet, or inches, until the user quits. `main` is already written, and it's already broken into methods: one reads the distance, one shows the menu, three do the math, and one displays each result. None of those methods exist yet. Your job is to write them.

## What You'll Practice

- Working out a method's header from how it's called (Day 3 notes, FD1)
- The three kinds of method: input, calculation, and output (Day 3 notes, FD1)
- Passing a `Scanner` to an input method (Day 3 notes, FD1)
- A method that calls a method (Day 1 notes, M3)
- Reusing one output method for several results (Day 1 notes: code reuse)
- Value-returning methods (Day 2 notes, R1 and R2)

## How This Challenge Works

Edit `src/ConversionProgram.java`. The class is `ConversionProgram`. Do not rename the file or the class.

The comments in the code are tagged:

| Tag | Meaning |
|---|---|
| `INFO:` | Background information. Nothing to do. |
| `GIVEN:` | Code that is already written. Don't change it. |
| `TODO n:` | Your work. Each TODO has a `(method)` part below `main`. Most also have a `(call)` part inside `main`. |

The calls are already written, but they're commented out. Work one TODO at a time, in order:

1. Read the job description under `TODO n (method)`.
2. Find the call in `main` and work out the header from it (see Reading a Call below).
3. Write the method: header and body.
4. Uncomment the lines under `TODO n (call)`. To uncomment several lines, select them and press **Ctrl + /**.
5. Run the program and compare your output to this README.

TODO 3 has no call block of its own. `showResult` is called in the TODO 4, 5, and 6 blocks, so you'll test it when you finish TODO 4.

IntelliJ lists every TODO in its TODO window (**View > Tool Windows > TODO**).

## Reading a Call

There are no documentation comments this time. The call in `main` tells you everything the header needs. All methods in this chapter are `public static`.

| In the call | Tells you |
|---|---|
| The result is stored in a variable, like `double kilometers = calcKilometers(meters);` | The return type is that variable's type. |
| The call stands alone as a statement, like `showMenu();` | Nothing comes back, so the method is `void`. |
| Each argument, like `meters` or `"kilometers"` | One parameter of the same type, in the same order. To find an argument's type, look at where that variable is declared in `main`. |
| Empty parentheses | No parameters. |

## Inputs

| Order | What it is | Java type | Read by |
|---|---|---|---|
| 1 | The distance in meters | `int` | Your `getDistance` method |
| 2, 3, ... | A menu choice, read again after each conversion | `int` | GIVEN code |

## Your TODOs

### TODO 1: getDistance

- **Kind:** input method
- **Job:** prints `Enter a distance in meters: ` with `print`, so the user types on the same line, then reads a whole number with the `Scanner` it receives and sends that number back
- **Header:** work it out from the TODO 1 call
- **Call:** uncomment the line under `TODO 1 (call)`

<details>
<summary>Hint for TODO 1</summary>

Look at `getGallons` in Day 3 notes, FD1. It receives the `Scanner` as a parameter, prints a prompt, and returns what the user typed. In the TODO 1 call, `keyboard` is a `Scanner` and the result goes into `meters`, which is declared as an `int`.

</details>

### TODO 2: showMenu

- **Kind:** output method
- **Job:** prints the four options, one per line:
  ```
  1. Convert to kilometers
  2. Convert to feet
  3. Convert to inches
  4. Quit the program
  ```
- **Header:** work it out from the TODO 2 call
- **Call:** uncomment the line under `TODO 2 (call)`

<details>
<summary>Hint for TODO 2</summary>

The call `showMenu();` stands alone, and nothing is stored, so nothing comes back. The parentheses in the call are empty, so there are no parameters.

</details>

### TODO 3: showResult

- **Kind:** output method
- **Job:** prints one line: `[meters] meters is [result] [unit].`, for example `500 meters is 0.5 kilometers.`
- **Header:** work it out from the `showResult` calls under TODO 4, 5, and 6
- **Call:** none of its own. TODO 4 is the first call that uses it.

<details>
<summary>Hint for TODO 3</summary>

Look at `displayResults` in Day 3 notes, FD1: an output method is `void` and takes the values it displays. In `showResult(meters, kilometers, "kilometers");`, find each argument's type: `meters` is declared in `main`, `kilometers` is declared on the line above the call, and `"kilometers"` is text in quotes. The parameters match them in the same order. The same method works for all three calls; only the values change.

</details>

### TODO 4: calcKilometers

- **Kind:** calculation method (no printing)
- **Job:** sends back the kilometers: `meters * 0.001`
- **Header:** work it out from the TODO 4 call
- **Call:** uncomment the two lines under `TODO 4 (call)`. TODO 3 must be done.

<details>
<summary>Hint for TODO 4</summary>

Look at `gallonsToLiters` in Day 3 notes, FD1: it takes a value, does the math, and returns the result. The result of `calcKilometers` is stored in a `double`, and the argument `meters` is an `int`. A calculation method doesn't print anything; `showResult` does that.

</details>

### TODO 5: calcFeet

- **Kind:** calculation method (no printing)
- **Job:** sends back the feet: `meters * 3.281`
- **Header:** work it out from the TODO 5 call
- **Call:** uncomment the two lines under `TODO 5 (call)`

<details>
<summary>Hint for TODO 5</summary>

`calcFeet` has the same shape as `calcKilometers`. Only the name and the math change.

</details>

### TODO 6: calcInches

- **Kind:** calculation method (no printing) that calls another method
- **Job:** sends back the inches. A foot is 12 inches, so `calcInches` calls `calcFeet` and multiplies what it sends back by 12. Don't use a new conversion number.
- **Header:** work it out from the TODO 6 call
- **Call:** uncomment the two lines under `TODO 6 (call)`. TODO 5 must be done.

<details>
<summary>Hint for TODO 6</summary>

Look at `checkEngines` in Day 1 notes, M3: it calls `checkFuel`, waits for it to finish, then continues. Here, `calcInches` calls `calcFeet`, passing it the same `meters`, and uses the value that comes back. You can store that value in a local variable first, or multiply the call directly: a call that returns a value can go anywhere that value could go.

</details>

## Exact Output

Spelling, capitalization, and punctuation must match. Extra spaces don't count against you, but missing spaces do.

The lines your methods print:

```
Enter a distance in meters: 
1. Convert to kilometers
2. Convert to feet
3. Convert to inches
4. Quit the program
[meters] meters is [result] [unit].
```

The choice prompt, the invalid-selection message, and the goodbye message are printed by GIVEN code. The distance prints as a whole number, and each result prints as a Java `double`, so 500 meters is `0.5` kilometers and `1640.5` feet.

## Sample Runs

All six TODOs finished:

```text
Enter a distance in meters: 500

1. Convert to kilometers
2. Convert to feet
3. Convert to inches
4. Quit the program
Enter your choice: 1
500 meters is 0.5 kilometers.

1. Convert to kilometers
2. Convert to feet
3. Convert to inches
4. Quit the program
Enter your choice: 2
500 meters is 1640.5 feet.

1. Convert to kilometers
2. Convert to feet
3. Convert to inches
4. Quit the program
Enter your choice: 4
Thank you. Have a nice day!
```

An invalid choice:

```text
Enter a distance in meters: 500

1. Convert to kilometers
2. Convert to feet
3. Convert to inches
4. Quit the program
Enter your choice: 9
Invalid selection. Enter your choice: 3
500 meters is 19686.0 inches.

1. Convert to kilometers
2. Convert to feet
3. Convert to inches
4. Quit the program
Enter your choice: 4
Thank you. Have a nice day!
```

Only TODO 1 and TODO 2 finished. The program still runs; choosing a conversion just shows the menu again:

```text
Enter a distance in meters: 500

1. Convert to kilometers
2. Convert to feet
3. Convert to inches
4. Quit the program
Enter your choice: 1

1. Convert to kilometers
2. Convert to feet
3. Convert to inches
4. Quit the program
Enter your choice: 4
Thank you. Have a nice day!
```

## Test Your Program

Run each test before you submit. The autograder uses these and other values.

| Meters | Choice | Line to look for |
|---|---|---|
| `500` | `1` | `500 meters is 0.5 kilometers.` |
| `500` | `2` | `500 meters is 1640.5 feet.` |
| `500` | `3` | `500 meters is 19686.0 inches.` |
| `250` | `1` | `250 meters is 0.25 kilometers.` |
| `250` | `3` | `250 meters is 9843.0 inches.` |
| `1000` | `2` | `1000 meters is 3281.0 feet.` |
| `500` | `9` | `Invalid selection. Enter your choice:` |

End each test by choosing `4`.

## How It's Checked

| Check | What it looks for | Points |
|---|---|---|
| TODO 1: getDistance header | A method named `getDistance` with one `Scanner` parameter that returns an `int` | 2 |
| TODO 1: Distance prompt | `Enter a distance in meters:` | 2 |
| TODO 2: showMenu header | A `void` method named `showMenu` with no parameters | 1 |
| TODO 2: Menu | All four options, in order | 2 |
| TODO 3: showResult header | A `void` method named `showResult` whose parameters match the call: `int`, `double`, `String` | 2 |
| TODO 3: showResult for 250 meters (needs TODO 4) | `250 meters is 0.25 kilometers.` | 3 |
| TODO 4: calcKilometers header | A method named `calcKilometers` with one `int` parameter that returns a `double` | 1 |
| TODO 4: 500 meters to kilometers | `0.5 kilometers` | 2 |
| TODO 4: Hidden distance to kilometers | The kilometers for a distance you haven't seen | 1 |
| TODO 5: calcFeet header | A method named `calcFeet` with one `int` parameter that returns a `double` | 1 |
| TODO 5: 500 meters to feet | `1640.5 feet` | 2 |
| TODO 5: Hidden distance to feet | The feet for a distance you haven't seen | 1 |
| TODO 6: calcInches header | A method named `calcInches` with one `int` parameter that returns a `double` | 1 |
| TODO 6: calcInches calls calcFeet | A call to `calcFeet` inside `calcInches` | 1 |
| TODO 6: 500 meters to inches | `19686.0 inches` | 2 |
| TODO 6: Hidden distance to inches | The inches for a distance you haven't seen | 1 |
| **Total** | | **25** |

- Header checks score even if your program doesn't compile. Output checks need it to compile.
- Hidden tests run when you submit, not in the Iteryx window.

## Where to Look

- Day 3 notes, FD1 (One task per method): input, calculation, and output methods, and a `main` that calls them in order.
- Day 1 notes, M3 (A method that calls a method): one method calling another and waiting for it to finish.
- Day 2 notes, R1 (Sending the value back) and R2 (Using a return value): writing a value-returning method.
- Day 1 notes, P2 (Two parameters): arguments match parameters by position.
- Reading a Call, above: how to get a header from a call.
