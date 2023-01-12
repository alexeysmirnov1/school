package Snake.Views;

import Snake.Models.Model;
import java.util.ArrayList;

public interface View {
    public void with(Model model);

    public View handle(String signal);

    public ArrayList<String> render();
}