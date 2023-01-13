package Snake.Views;

import Snake.Models.*;
import Snake.Views.View;
import Snake.Controllers.*;
import java.util.ArrayList;

public class MainMenuView extends MenuView implements View {
    private Model menu;

    public void with(Model menu) {
        this.menu = menu;
    }

    public String title() {
        return "SNAKE GAME";
    }

    public ArrayList<String> render() {
        return this.menu.data();
    }

    public View handle(String signal) {
        View view;

        switch (signal) {
            case "1": view = this.newGame(); break;
            case "2": view = this.help(); break;
            default: view = this.index(); break;
        }

        return view;
    }
}
