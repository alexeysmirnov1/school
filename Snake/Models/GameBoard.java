package Snake.Models;

import java.util.ArrayList;

public class GameBoard implements Model {
    public static int size;
    public static String[][] map;

    public static Snake snake;

    public static int xFood = 0;
    public static int yFood = 0;

    public ArrayList<String> data() {
        ArrayList<String> lines = new ArrayList<String>();

        this.generateMap();

        for (int i = 0; i < GameBoard.size; i++) {
            String line = "|";
            for (int j = 0; j < GameBoard.size; j++) {
                line += map[i][j] + "|";
            }
            lines.add(line);
        }

        return lines;
    }

    public void addSnake(Snake snake) {
        this.snake = snake;
    }

    public void snakeToCenter() {
        this.snake.setPosition(this.findCenter(), this.findCenter());
    }

    public void generateMap() {
        GameBoard.map = new String[GameBoard.size][GameBoard.size];

        this.renderEmptyBoard();
        this.renderSnake();
        this.renderFood();
    }

    public void renderEmptyBoard() {
        for (int i = 0; i < GameBoard.size; i++) {
            for (int j = 0; j < GameBoard.size; j++) {
                GameBoard.map[i][j] = " ";
            }
        }
    }

    public void renderSnake() {
        for (int[] coords : GameBoard.snake.body()) {
            GameBoard.map[coords[0]][coords[1]] = "x";
            System.out.println(coords[0] + " - " + coords[1]);
        }
    }

    public void renderFood() {
        boolean success = false;

        if (GameBoard.xFood != 0 && GameBoard.yFood != 0) {
            GameBoard.map[GameBoard.xFood][GameBoard.yFood] = "*";
            success = true;
        }

        while (!success) {
            if (GameBoard.xFood != 0 && GameBoard.yFood != 0) {
                GameBoard.map[GameBoard.xFood][GameBoard.yFood] = "*";
                break;
            }

            GameBoard.xFood = (int) (Math.random() * (GameBoard.size - 1));
            GameBoard.yFood = (int) (Math.random() * (GameBoard.size - 1));

            String grid = GameBoard.map[GameBoard.xFood][GameBoard.yFood];
            if (!grid.equals("x")) {
                GameBoard.map[GameBoard.xFood][GameBoard.yFood] = "*";
                success = true;
            }
        }
    }

    public void moveSnakeUp() {
        int[] head = GameBoard.snake.headPosition();

        if(head[0] > 0) {
            head[0] -= 1;
        }

        this.snakeEatFood(head);

        GameBoard.snake.setPosition(head[0], head[1]);
    }

    public void moveSnakeDown() {
        int[] head = GameBoard.snake.headPosition();

        if(head[0] < GameBoard.size - 1) {
            head[0] += 1;
        }

        this.snakeEatFood(head);

        GameBoard.snake.setPosition(head[0], head[1]);
    }

    public void moveSnakeLeft() {
        int[] head = GameBoard.snake.headPosition();

        if(head[1] > 0) {
            head[1] -= 1;
        }

        this.snakeEatFood(head);

        GameBoard.snake.setPosition(head[0], head[1]);
    }

    public void moveSnakeRight() {
        int[] head = GameBoard.snake.headPosition();

        if(head[1] < GameBoard.size - 1) {
            head[1] += 1;
        }

        this.snakeEatFood(head);

        GameBoard.snake.setPosition(head[0], head[1]);
    }

    public void snakeEatFood(int[] head) {
        if (GameBoard.xFood == head[0] && GameBoard.yFood == head[1]) {
            GameBoard.xFood = 0;
            GameBoard.yFood = 0;

            GameBoard.snake.grow();
        }
    }

    private int findCenter() {
        return GameBoard.size / 2;
    }
}
