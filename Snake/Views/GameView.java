package Snake.Views;

import Snake.Models.*;
import Snake.Views.View;
import Snake.Controllers.*;
import java.util.ArrayList;

public class GameView implements View {
    private Model board;

    public void with(Model board) {
        this.board = board;
    }

    public String title() {
        return "Змейка";
    }

    public ArrayList<String> render() {
        return this.board.data();
    }

    public View handle(String signal) {
        View view;

        switch (signal) {
            case "w": view = this.moveUp(); break;
            case "s": view = this.moveDown(); break;
            case "a": view = this.moveLeft(); break;
            case "d": view = this.moveRight(); break;
            default: view = this.index(); break;
        }

        return view;
    }

    public View moveUp() {
        GameController controller = new GameController();
        return controller.moveUp();
    }

    public View moveDown() {
        GameController controller = new GameController();
        return controller.moveDown();
    }

    public View moveLeft() {
        GameController controller = new GameController();
        return controller.moveLeft();
    }

    public View moveRight() {
        GameController controller = new GameController();
        return controller.moveRight();
    }

    public View index() {
        GameController controller = new GameController();
        return controller.index();
    }
}
