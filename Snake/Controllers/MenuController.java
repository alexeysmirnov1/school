package Snake.Controllers;

import Snake.Models.*;
import Snake.Views.*;

public class MenuController implements Controller {
    public View start() {
        Menu menu = new Menu();

        View view = new MenuView();
        view.with(menu);

        return view;
    }

    public View newGame() {
        System.out.println("start new game");

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
