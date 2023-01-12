package Snake.Models;

import java.util.ArrayList;

public class Menu implements Model {
    private ArrayList<String> output = new ArrayList<String>();

    public Menu() {
        this.output.add("1) Начать новую игру");
        this.output.add("2) Управление");
        this.output.add("q) Выйти");
    }

    public ArrayList<String> data() {
        return this.output;
    }
}
