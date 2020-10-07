import java.util.Scanner;

/**
 * calculate the sum of all of the odd numbers from 1 to that entered number @
 * Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user to enter a number to calcualte max sum
    System.out.println("Please enter the maximum number to sum to:");
    int sum = input.nextInt();

    // create variable to represent zero
    int total = 0;

    //
    for (int count = 1; count <= sum; count = count + 2) {
      total = count + total;
    }
    System.out.print("The sum of the odd numbers is " + total);

  }
}
