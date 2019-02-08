import java.util.Scanner;
import java.util.InputMismatchException;

class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Rectangle myRectangle = new Rectangle();
    System.out.println("Please enter the width of the box you wish to draw");

    int w;

    //if user has given a number smaller than 0 or the width given is not an integer, ask them to try again
    do {
        while (!scanner.hasNextInt())
        {
          String input = scanner.next();
          System.out.printf("\"%s\" is not a valid number. Please try again:\n" , input);
        }
        w = scanner.nextInt();
        if(w <= 0)
         {
            System.out.println("Width must be more than 0:");
          }
        } while (w <= 0);

  int h;

  System.out.println("Please enter the height of the box you wish to draw:");

  //if user has given a number smaller than 0 or the height given is not an integer, ask them to try again

  do {
        while (!scanner.hasNextInt())
        {
          String input = scanner.next();
          System.out.printf("\"%s\" is not a valid number. Please try again:\n", input);
        }
        h = scanner.nextInt();
        if(h <= 0)
          {
            System.out.println("Height must be more than 0");
          }
        } while (h <= 0);

      System.out.println(myRectangle.draw(w,h));

   }

}
