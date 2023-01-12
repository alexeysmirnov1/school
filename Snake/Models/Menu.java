package Snake.Models;

import java.util.ArrayList;

public class Menu implements Model {
    public ArrayList<String> render() {
        ArrayList<String> lines = new ArrayList<String>();

        lines.add("1) Начать новую игру");
        lines.add("2) Управление");
        lines.add("q) Выйти");

        return lines;
    }
}
