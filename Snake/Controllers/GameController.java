package Snake.Controllers;

import Snake.Models.*;
import Snake.Views.*;

public class GameController implements Controller {
    public View index(int sizeBoard) {
        GameBoard board = new GameBoard();
        GameBoard.size = sizeBoard;
        board.addSnake(new Snake());
        board.snakeToCenter();

        View view = new GameView();
        view.with(board);

        return view;
    }

    public View index() {
        GameBoard board = new GameBoard();
        board.addSnake(new Snake());

        View view = new GameView();
        view.with(board);

        return view;
    }

    public View moveUp() {
        GameBoard board = new GameBoard();
        board.addSnake(new Snake());
        board.moveSnakeUp();

        View view = new GameView();
        view.with(board);

        return view;
    }

    public View moveDown() {
        GameBoard board = new GameBoard();
        board.addSnake(new Snake());
        board.moveSnakeDown();

        View view = new GameView();
        view.with(board);

        return view;
    }

    public View moveLeft() {
        GameBoard board = new GameBoard();
        board.addSnake(new Snake());
        board.moveSnakeLeft();

        View view = new GameView();
        view.with(board);

        return view;
    }

    public View moveRight() {
        GameBoard board = new GameBoard();
        board.addSnake(new Snake());
        board.moveSnakeRight();

        View view = new GameView();
        view.with(board);

        return view;
    }
}
