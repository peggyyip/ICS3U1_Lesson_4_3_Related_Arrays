# 4.3 Related Arrays

When using arrays, it is very common to have two or more arrays that are related to each other. A phone book might have two arrays, one for people’s names called `names` and one for phone numbers called `phoneNumbers`. The two arrays are **<ins>RELATED ARRAYS</ins>** because the information in one element at a specific index of the `names` list is related to the element at the same index of the `phoneNumbers` list.

## Example #1

```java
// Initalize the related arrays
String[] names = {"Iron Man", "Captain America", "Hulk", "Thor"};
String[] phoneNumbers = {"(213) 536-3735", "(313) 374-6638" ,"(212) 883-8839", "(402) 773-8262"};

// Print out the phone number for Captain America
System.out.println(names[1] + ": " + phoneNumbers[1]);

// Print out a list of names and numbers
for (int i = 0; i < names.length; i++) {
    System.out.println(names[i] + ": " + phoneNumbers[i] + "\n");
}
```

## Example #2:
Write a **method** called `dayOfYear` that calculates the number of the day of a specified date.

For example, the user can enter April 12 and the program will output that it is day 102 of the year.  The program ignores leap years.

This program will use two arrays:
1. `monthNames` -  a list of strings that holds the name of each month. 
    * e.g. `monthNames[0]` would hold `“Jan”`, `monthNames[1]` would hold `“Feb”`
2. `daysInMonth` - a list of integers holding the number of days in a specified month. 
    * e.g. `daysInMonth[5]` holds `30`, the number of days in `"June"`  

```java
String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
```


### Sample run of the program:
```
Enter a month (first 3 letters): Apr
Enter a day in the month: 12
Apr 12 is day 102
```

### The program:
```java
/**
* Compute the number of days in the year for a given day
* @param month  the month to compute the day number
* @param day    the day in the month
* @return the number of days in the year i.e month = 5, day = 15, return 135
*/
public int dayOfYear(String month, int day) {
  // Initialize related arrays
  String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

  int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  // Initialize variables to keep track of
  int total = 0;
  int current_month = 0;

  // Loop until it reaches the specified month
  while (!month.equals(monthNames[current_month])) {
    total += daysInMonth[current_month]; // Update total days
    current_month++; // Update current_month index
  }

  // Add the nth day of the month
  total += day;

  return total;
}
```

## Practice
Create two arrays: `players` and `scores`. `players` stores a list of 8 player names, `scores` stores the score of the players with the corresponding index.
1. Output the player names and corresponding scores in a table
2. Write a program that finds and outputs the name and score of the player with the highest score