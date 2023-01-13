package Snake.Controllers;

import Snake.Models.*;
import Snake.Views.*;

public class GameController implements Controller {
    public View start(int sizeBoard) {
        GameBoard board = new GameBoard();
        board.setSize(sizeBoard);
        board.addSnake(new Snake());
        board.snakeToCenter();

        View view = new GameView();
        view.with(board);

        return view;
    }


}
