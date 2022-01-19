import java.util.Scanner;

public class Game {
    private Grid grid;

    public Game(Grid grid) {
        this.grid = grid;
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        while(true) {
            if (grid.gameIsOver()) {
                break;
            }
            grid.draw();
            grid.shift(input.nextLine());
        }
        input.close();
    }
    
    public static void main(String[] args) throws Exception {
        Grid grid = new Grid();
        Game game = new Game(grid);
        game.play();
      }
}
