package Snake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Gamepad {
    private ArrayList<String> steps = new ArrayList<String>();

    public Gamepad() {
        this.steps.add("w");
        this.steps.add("s");
        this.steps.add("a");
        this.steps.add("d");
    }

    public String getPlayerStep() {
        String inputLine = "";
        System.out.println("Выберете направление движения змейки");
        System.out.println("w - вверх, s - вниз, a - влево, d - вправо");

        while (inputLine.length() == 0) {
            try {
                BufferedReader is = new BufferedReader(
                    new InputStreamReader(
                            System.in
                    )
                );

                inputLine = is.readLine();

                if (inputLine.length() == 0 || !this.steps.contains(inputLine)) {
                    System.out.println("Недопустимое значение. Попробуйте ещё раз.");
                    inputLine = "";
                }
            } catch (IOException e) {
                System.out.println("IOException: " + e);
            }
        }

        return inputLine;
    }
}
