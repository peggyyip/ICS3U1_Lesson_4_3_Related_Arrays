class Example2 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    String month = readLine("Enter a month (first 3 letters): ");
    int day = readInt("Enter a day in the month: ");

    // Test the method here:
    System.out.println(month + " " + day + " is day " + dayOfYear(month, day));
  }

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
}
