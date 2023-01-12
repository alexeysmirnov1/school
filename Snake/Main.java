package Snake;

import Snake.Services.*;
import Snake.Views.*;
import Snake.Models.*;

public class Main {
    public static void main(String[] args) {
        String sign = null;

        Gamepad gamepad = new Gamepad();
        Display display = new Display();
        MainMenuView menu = new MainMenuView();
        menu.with(new Menu());
        View view = menu;

        do {
            display.render(view);
            sign = gamepad.awaitSignal();
            view = view.handle(sign);
        } while (! sign.equals("q") );
    }
}
