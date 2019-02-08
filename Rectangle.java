import java.util.InputMismatchException;

//Rectangle object
public class Rectangle{



public Rectangle() {

}

//method to draw the box with the given 2 dimensions
  public static String draw(int width,int height) //width=widht; heigh=height
  {

    String upperLeft = "┌";
    String upperRight = "┐";
    String lowerLeft = "└";
    String lowerRight = "┘";
    String box = "";

    //if one of the dimensions is 0
    //return an empty box
   if(width<=0||height<=0)
    {
          box = "";
    }

      box+=upperLeft;

      //draw the upper line of the box
      for (int i=0; i< width - 2; i++)
      {
        box+="-";
      }
      box+=upperRight+"\n";

      //draw the sides
      for(int i=0; i < height - 2; i++)
      {
        box+="|" + getWhiteSpaces(width) + "|" + "\n";
      }
      box+=lowerLeft;

      //draw the lower line of the box
      for (int i=0; i < width - 2; i++)
      {
        box+="-";
      }

      box+=lowerRight;

    return box;

  }

  //draw the empty space in the box
  public static String getWhiteSpaces(int x)
  {
    String ret="";
    for(int i=0 ;i<x-2; i++)
    {
      ret+=" ";
    }
    return ret;
  }

}
