package Snake.Controllers;

import Snake.Models.*;
import Snake.Views.*;

public class GameController implements Controller {
    public View start() {
        return new GameView();
    }
}
