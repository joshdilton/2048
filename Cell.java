import java.lang.Math;
import java.awt.Color;

public class Cell {
  private int number;
  private Color color;
  private int xLoc;
  private int yLoc;
  private static final Color[] COLORS = {new Color(255,255,240), new Color(255,251,229),
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
    System.out.println(xLoc);
  }

  private Cell(Cell a, Cell b) {
    number = a.getNumber() + b.getNumber();
    if (number > 128) {
      color = Color.YELLOW;
    } else {
      color = COLORS[(int) ((Math.log10(number)) / Math.log10(2) - 1)];
    }
  }
 
  public Cell merge(Cell a, Cell b) {
    if (a.getNumber() != b.getNumber()) {
      System.out.println();
      return null;
    } else {
      return new Cell(a, b);
    }
  }

  public int rand() {
      return ((int) ((Math.random() * 2) + 1) * 2);
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