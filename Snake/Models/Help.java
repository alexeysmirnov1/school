package Snake.Models;

import java.util.ArrayList;

public class Help implements Model {
    public ArrayList<String> render() {
        ArrayList<String> lines = new ArrayList<String>();

        lines.add("Для передвижения используйте");
        lines.add("клавишы wasd");
        lines.add("1) Назад");

        return lines;
    }
}
