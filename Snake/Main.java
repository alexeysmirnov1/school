package Snake;

import Snake.Services.*;
import Snake.Views.*;
import Snake.Models.*;

public class Main {
    public static void main(String[] args) {
        String sign = null;

        Gamepad gamepad = new Gamepad();
        Display display = new Display();
        MenuView menu = new MenuView();
        menu.with(new Menu());
        View view = menu;
        display.render(view);

        do {
            sign = gamepad.awaitSignal();
            view = view.handle(sign);
            display.render(view);
        } while (! sign.equals("q") );
    }
}
