class Example1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // Initalize the related arrays
    String[] names = {"Iron Man", "Captain America", "Hulk", "Thor"};
    String[] phoneNumbers = {"(213) 536-3735", "(313) 374-6638" ,"(212) 883-8839", "(402) 773-8262"};

    // Print out the phone number for Captain America
    System.out.println(names[1] + ": " + phoneNumbers[1] + "\n");

    // Print out a list of names and numbers
    for (int i = 0; i < names.length; i++) {
        System.out.println(names[i] + ": " + phoneNumbers[i]);
    }
  }
}
