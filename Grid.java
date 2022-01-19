import java.awt.Font;

public class Grid {
    private Cell[][] cells = new Cell[4][4];
    private static Font font = new Font("SANS_SERIF" , Font.PLAIN, 20);

    public Grid() {
        Cell cell1 = new Cell(this);
        Cell cell2 = new Cell(this);
        cells[cell1.getX()][cell1.getY()] = cell1;
        cells[cell2.getX()][cell2.getY()] = cell2;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }

    public boolean gameIsOver() {
        return false;
    }

    public void draw() {
        StdDraw.setScale(0,4);
        StdDraw.setFont(font);
        for(int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j] == null) { continue; }
                StdDraw.setPenColor(cells[i][j].getColor());
                StdDraw.filledSquare(i + .5, j + .5, .5);
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.text(i + .5, j + .5, "" + cells[i][j].getNumber());
            }
        }

        StdDraw.setPenColor(StdDraw.BLACK);
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                StdDraw.square(i + .5, j + .5, .5);
            }
        }
    }
    
    public boolean shift(String input) {
        /*
        if(input.equals("s")) {
            return shiftDown();
        }
        if(input.equals("w")) {
            return shiftUp();
        }
        if(input.equals("a")) {
            return shiftLeft();
        }
        */
        if(input.equals("d")) {
            return shiftRight();
        }
        return false;
    }

    private boolean shiftRight() {
        return true;
    }

  }
  