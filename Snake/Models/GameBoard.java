package Snake.Models;

import java.util.ArrayList;

public class GameBoard implements Model {
    public static int size;

    public static Snake snake;

    public ArrayList<String> data() {
        ArrayList<String> lines = new ArrayList<String>();

        lines.add("|" + " |".repeat(this.size));
        lines.add("|" + " |".repeat(this.size));
        lines.add("|" + " |".repeat(this.size));
        lines.add("|" + " |".repeat(this.size));
        lines.add("|" + " |".repeat(this.size));

        return lines;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addSnake(Snake snake) {
        this.snake = snake;
    }

    public void snakeToCenter() {
        this.snake.setPossition();
    }

    private void generateMap() {
        //
    }

    private int findCenter() {
        return this.size / 2;
    }
}
