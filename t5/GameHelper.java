package t5;

import java.io.*;
import java.util.*;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[this.gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                new InputStreamReader(
                    System.in
                )
            );
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine;
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphacoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        this.comCount++;
        int incr = 1;
        if ((this.comCount % 2) == 1) {
            incr = this.gridLength;
        }

        while (!success && attempts++ < 200) {
            location = (int) (Math.random() * this.gridSize);
            int x = 0;
            success = true;

            while (success && x < comSize) {
                if (this.grid[location] == 0) {
                    coords[x++] = location;
                    location += incr;
                    if (location >= this.gridSize) {
                        success = false;
                    }

                    if (x > 0 && (location % this.gridLength == 0)) {
                        success = false;
                    }
                } else {
                    success = false;
                }
            }
        }

        int x = 0;
        int row = 0;
        int column = 0;

        while (x < comSize) {
            this.grid[coords[x]] = 1;
            row = (int) (coords[x] / this.gridLength);
            column = coords[x] % this.gridLength;
            temp = String.valueOf(alphabet.charAt(column));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }

        return alphaCells;
    }
}
