package Snake.Views;

import Snake.Views.View;
import Snake.Controllers.*;

public abstract class MenuView implements View {
    protected View index() {
        MenuController controller = new MenuController();
        return controller.index();
    }

    protected View newGame() {
        MenuController controller = new MenuController();
        return controller.newGame();
    }

    protected View help() {
        MenuController controller = new MenuController();
        return controller.help();
    }
}
