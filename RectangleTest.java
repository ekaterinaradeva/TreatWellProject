import org.junit.Assert;

public class RectangleTest{

   final String actualDraw = Rectangle.draw(4,4);
   final String expectedDraw = "┌----┐"+"\n"+"|    |"+"\n"+"|    |"+"\n"+"└----┘";
   final String actualSpace =Rectangle.getWhiteSpaces(4);
   final String expectedSpace = "  ";

//Unit testing of method draw

public void draw()
  {
   Assert.assertEquals(actualDraw,expectedDraw);
  }

//unit testing of method getWhiteSpaces
public void getWhiteSpaces()
{
  Assert.assertEquals(actualSpace,expectedSpace);
}




}
