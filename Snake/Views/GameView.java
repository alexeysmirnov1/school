package Snake.Views;

import Snake.Models.*;
import Snake.Views.View;
import Snake.Controllers.*;
import java.util.ArrayList;

public class GameView implements View {
    private Model snake;

    public void with(Model snake) {
        this.snake = snake;
    }

    public String title() {
        return "Змейка";
    }

    public ArrayList<String> render() {
        return this.snake.data();
    }

    public View handle(String signal) {
        GameController controller = new GameController();
        return controller.start(GameBoard.size);
    }
}
