class Practice extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // Initialize related arrays
    String[] players = {"LeBron James", "John Stockton", "Pete Maravich", "Drazen Petrovich", "Patrick Ewing"};
    double[] scores = {30.4, 21.7, 32.5, 28.6, 28.0};

    // Output the player names and scores
    for (int i = 0; i < players.length; i++) {
      System.out.println(players[i] + ":  " + scores[i]);
    } 

    // Find the highest scorer
    int intMaxPosition = 0; // current index with max score
    double dblMaxScore = scores[0]; // current max score
    
    // Loop through the array and compare scores
    for (int currentPosition = 1; currentPosition < scores.length; currentPosition++) {
      if (scores[currentPosition] > dblMaxScore) {
        intMaxPosition = currentPosition;
        dblMaxScore = scores[currentPosition];
      }
    }
    System.out.println("The player with the highest score is " + players[intMaxPosition]);
  }
}
