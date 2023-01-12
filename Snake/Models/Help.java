package Snake.Models;

import java.util.ArrayList;

public class Help implements Model {
    private ArrayList<String> output = new ArrayList<String>();

    public Help() {
        this.output.add("Для передвижения используйте");
        this.output.add("клавишы wasd");
        this.output.add("1) Назад");
    }

    public ArrayList<String> data() {
        return this.output;
    }
}
