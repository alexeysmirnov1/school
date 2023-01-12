package Snake.Services;

import Snake.Models.*;
import Snake.Views.*;

public class Display {
    private final int displayWidth = 31;

    public void render(View view) {
        this.header();

        for (String line : view.render()) {
            this.render(line);
        }

        this.footer();
    }

    private void header() {
        System.out.println("  |                               |  ");
        System.out.println("--*-------------------------------*--");
        System.out.println("  |           SNAKE GAME          |  ");
        System.out.println("  |                               |  ");
    }

    private void footer() {
        System.out.println("  |                               |  ");
        System.out.println("--*-------------------------------*--");
        System.out.println("  |                               |  ");
    }

    private void leftPadding() {
        System.out.print("  |");
    }

    private void rightPadding() {
        System.out.print("|  ");
        System.out.println();
    }

    private void render(String line) {
        this.leftPadding();

        int lineLength = this.displayWidth - line.length();
        String renderLine = "";
        int padding = lineLength / 2;

        System.out.print(" ".repeat(padding) + line + " ".repeat(padding));
        if (lineLength % 2 != 0) {
            System.out.print(" ");
        }

        this.rightPadding();

//         System.out.println("| | | | | | | | | | | | |");
    }
}
