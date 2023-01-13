package Snake.Views;

import Snake.Models.*;
import Snake.Views.View;
import Snake.Controllers.*;
import java.util.ArrayList;

public class BoardView implements View {
    public void with(Model board) {}

    public String title() {
        return "Змейка";
    }

    public ArrayList<String> render() {
        ArrayList<String> lines = new ArrayList<String>();

        lines.add("Введите размер игровой доски");
        lines.add("Допустимы значения 5-12");

        return lines;
    }

    public View handle(String signal) {
        int size = Integer.parseInt(signal);

        if (size < 5 || size > 12) {
            MenuController controller = new MenuController();
            return controller.newGame();
        }

        GameController controller = new GameController();
        return controller.index(size);
    }
}
