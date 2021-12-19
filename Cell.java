import java.lang.Math;
import java.awt.Color;
import java.lang.Exception;


public class Cell {
  private int number;
  private Color color;
  private int xLoc;
  private int yLoc;

  private static final Color[] COLORS = {new Color(255,240,220), new Color(255,220,200),
    new Color(244,164,96), new Color(210,105,30), new Color(250,128,114),
    new Color(178,34,34), Color.YELLOW};
  
  public Cell() {
    number  = 2 * ((int) (Math.random() * 2) + 1);
    if (number > 128) {
      color = Color.YELLOW;
    } else {
      color = COLORS[(int) ((Math.log10(number)) / Math.log10(2) - 1)];
    }
    xLoc = rand();
    yLoc = rand();
  }
  
  public static void main(String[] args) throws Exception {
    Grid grid = new Grid();
    grid.draw();
  }
  
  private Cell(Cell a, Cell b) {
    number = a.getNumber() + b.getNumber();
    if (number > 128) {
      color = Color.YELLOW;
    } else {
      color = COLORS[(int) ((Math.log10(number)) / Math.log10(2) - 1)];
    }
  }
  
  public static Cell merge(Cell a, Cell b) throws Exception {
    if (a.getNumber() != b.getNumber()) {
      throw new Exception("Merge attempt failed, Cells are not equal: " +  a.getNumber() + " != " + b.getNumber());
    } else {
      return new Cell(a, b);
    }
  }
  
  public static int rand() {
    return (int) (Math.random() * 4);
  }
  
  public int getNumber() {
    return number;
  }
  
  public int getX() {
    return xLoc;
  }
  
  public int getY() {
    return yLoc;
  }
  
  public Color getColor() {
    return color;
  }
}