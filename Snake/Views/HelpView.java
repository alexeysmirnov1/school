package Snake.Views;

import Snake.Models.*;
import Snake.Views.View;
import Snake.Controllers.*;
import java.util.ArrayList;

public class HelpView extends MenuView implements View {
    private Model help;

    public void with(Model help) {
        this.help = help;
    }

    public String title() {
        return "- Управление -";
    }

    public ArrayList<String> render() {
        return this.help.data();
    }

    public View handle(String signal) {
        View view;
        switch (signal) {
            case "1": view = this.index(); break;
            default: view = this.help(); break;
        }

        return view;
    }
}
