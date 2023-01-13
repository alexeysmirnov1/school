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
        return new BoardView();
    }

    public View help() {
        Help help = new Help();

        View view = new HelpView();
        view.with(help);

        return view;
    }
}
