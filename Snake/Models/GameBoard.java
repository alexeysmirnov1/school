package Snake.Models;

import java.util.ArrayList;

public class GameBoard implements Model {
    public static int size;
    public String[][] map = new String[GameBoard.size][GameBoard.size];
//    static
//    {
//        GameBoard.map = new String[GameBoard.size][GameBoard.size];
//    }

    public static Snake snake;

    public ArrayList<String> data() {
        ArrayList<String> lines = new ArrayList<String>();

        this.generateMap();

        System.out.println(map);

        for (int i = 0; i < GameBoard.size; i++) {
            String line = "|";
            for (int j = 0; j < GameBoard.size; j++) {
                line += map[i][j];
            }
            lines.add(line + "|");
        }

        return lines;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addSnake(Snake snake) {
        this.snake = snake;
    }

    public void snakeToCenter() {
        this.snake.setPossition(this.findCenter(), this.findCenter());
    }

    private void generateMap() {
        map[0][0] = "123";
        System.out.println(map);

        for (int i = 0; i < GameBoard.size; i++) {
            for (int j = 0; j < GameBoard.size; j++) {
                map[i][j] = " ";
            }
        }
    }

    private int findCenter() {
        return GameBoard.size / 2;
    }
}
