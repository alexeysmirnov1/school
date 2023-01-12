package Snake.Controllers;

import Snake.Models.*;
import Snake.Views.*;

public class MenuController implements Controller {
    public View index() {
        Menu menu = new Menu();

        View view = new MainMenuView();
        view.with(menu);

        return view;
    }

    public View newGame() {
        View view = new GameView();
        view.with(new Snake());

        return view;
    }

    public View help() {
        Help help = new Help();

        View view = new HelpView();
        view.with(help);

        return view;
    }
}
