package Snake.Views;

import Snake.Models.*;
import Snake.Views.View;
import Snake.Controllers.*;
import java.util.ArrayList;

public class HelpView implements View {
    private Model help;

    public void with(Model help) {
        this.help = help;
    }

    public ArrayList<String> render() {
        return this.help.render();
    }

    public View handle(String signal) {
        MenuController controller = new MenuController();
        return controller.start();
    }
}
