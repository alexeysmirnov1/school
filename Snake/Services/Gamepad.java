package Snake.Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Gamepad {
    public String awaitSignal() {
        String signal = "";

        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(
                            System.in
                    )
            );

            signal = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return signal;
    }
}
