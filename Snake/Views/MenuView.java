package Snake.Views;

import Snake.Models.*;
import Snake.Views.View;
import Snake.Controllers.*;
import java.util.ArrayList;

public class MenuView implements View {
    private Model menu;

    public void with(Model menu) {
        this.menu = menu;
    }

    public ArrayList<String> render() {
        return this.menu.render();
    }

    public View handle(String signal) {
        View view;
        switch (signal) {
            case "1": view = this.newGame(); break;
            case "2": view = this.help(); break;
            default: view = this.start(); break;
        }

        return view;
    }

    private View start() {
        MenuController controller = new MenuController();
        return controller.start();
    }

    private View newGame() {
        MenuController controller = new MenuController();
        return controller.newGame();
    }

    private View help() {
        MenuController controller = new MenuController();
        return controller.help();
    }
}
