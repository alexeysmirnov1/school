package Snake.Services;

import Snake.Models.*;
import Snake.Views.*;

public class Display {
    private final int displayWidth = 31;

    public void render(View view) {
        this.header(view);

        for (String line : view.render()) {
            this.content(line);
        }

        this.footer();
    }

    private void header(View view) {
        System.out.println(this.verticalPadding());
        System.out.println(this.horizonBorder());
        this.content(view.title());
        System.out.println(this.verticalPadding());
    }

    private void footer() {
        System.out.println(this.verticalPadding());
        System.out.println(this.horizonBorder());
        System.out.println(this.verticalPadding());
    }

    private void content(String line) {
        System.out.println(
            this.leftPadding()
            + this.lineFormat(line)
            + this.rightPadding()
        );
    }

    private String lineFormat(String line) {
        int lineLength = this.displayWidth - line.length();
        String renderLine = "";
        int padding = lineLength / 2;

        line = " ".repeat(padding) + line + " ".repeat(padding);
        if (lineLength % 2 != 0) {
            line += " ";
        }

        return line;
    }

    private String leftPadding() {
        return "  |";
    }

    private String rightPadding() {
        return "|  ";
    }

    private String verticalPadding() {
        return "  |                               |  ";
    }

    private String horizonBorder() {
        return "--*-------------------------------*--";
    }
}
