package Snake.Models;

import Snake.Services.Point;
import Snake.Exceptions.UroborosException;
import java.util.ArrayList;

public class GameBoard implements Model {
    public static int size;
    public static String[][] map;

    public static Snake snake;

    public static int xFood = -1;
    public static int yFood = -1;

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
        boolean head = true;
        for (int[] coords : GameBoard.snake.body()) {
            String charSnake = "x";

            if (head) {
                charSnake = "X";
            }

            GameBoard.map[coords[0]][coords[1]] = charSnake;

            head = false;
        }
    }

    public void renderFood() {
        boolean success = false;

        if (!this.foodDoesntHasOnMap()) {
            success = true;
        }

        while (!success) {
            success = true;
            this.generateFoodPosition();

            for (int[] position : GameBoard.snake.body()) {
                if(Point.equals(position, this.foodPosition())) {
                    success = false;
                }
            }
        }

        GameBoard.map[GameBoard.xFood][GameBoard.yFood] = "*";
    }

    public void moveSnakeUp() {
        int[] head = GameBoard.snake.headPosition();

        if(head[0] > 0) {
            head[0] -= 1;
        }

        this.snakeEatFood(head);
        this.snakeEatYourself(head);

        GameBoard.snake.setPosition(head[0], head[1]);
    }

    public void moveSnakeDown() {
        int[] head = GameBoard.snake.headPosition();

        if(head[0] < GameBoard.size - 1) {
            head[0] += 1;
        }

        this.snakeEatFood(head);
        this.snakeEatYourself(head);

        GameBoard.snake.setPosition(head[0], head[1]);
    }

    public void moveSnakeLeft() {
        int[] head = GameBoard.snake.headPosition();

        if(head[1] > 0) {
            head[1] -= 1;
        }

        this.snakeEatFood(head);
        this.snakeEatYourself(head);

        GameBoard.snake.setPosition(head[0], head[1]);
    }

    public void moveSnakeRight() {
        int[] head = GameBoard.snake.headPosition();

        if(head[1] < GameBoard.size - 1) {
            head[1] += 1;
        }

        this.snakeEatFood(head);
        this.snakeEatYourself(head);

        GameBoard.snake.setPosition(head[0], head[1]);
    }

    public void snakeEatFood(int[] head) {
        if (Point.equals(head, this.foodPosition())) {
            this.resetFoodPosition();

            GameBoard.snake.grow();
        }
    }

    private void snakeEatYourself(int[] head) {
        for (int[] position : GameBoard.snake.body()) {
            if(Point.equals(position, head)) {
                throw new UroborosException("");
            }
        }
    }

    private int findCenter() {
        return GameBoard.size / 2;
    }

    private int[] foodPosition() {
        int[] position = {GameBoard.xFood, GameBoard.yFood};
        return position;
    }

    private void resetFoodPosition() {
        GameBoard.xFood = -1;
        GameBoard.yFood = -1;
    }

    private boolean foodDoesntHasOnMap() {
        return (GameBoard.xFood < 0 && GameBoard.yFood < 0);
    }

    private void generateFoodPosition() {
        int[] position = Point.generateRandomPoint(GameBoard.size);

        GameBoard.xFood = position[0];
        GameBoard.yFood = position[1];
    }
}
