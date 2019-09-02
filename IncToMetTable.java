/*
      Try This 1-2
      This program displays a conversion
      table of inches to meters.
      Call this program "IncToMetTable.java".
*/
class IncToMetTable {
  public static void main (String agrs[]) {
    double inches, meters;
    int counter;

    counter = 0;
    for(meters = 1; meters <=100; meters++){
      inches = meters * 39.37; 
      System.out.println(meters + " meters is " +
			 inches + "inches.");

      counter++;
      if(counter == 12) {
	System.out.println();
	counter = 0 ; // reset line counter
      }
    }
  }
}