package Snake;

public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        Gamepad gamepad = new Gamepad();

        Snake snake = new Snake();
        snake.toStart(display.center());

        display.addSnake(snake);
        display.generateFood();
        display.render();

        while (true) {
            String step = gamepad.getPlayerStep();
            snake.doStep(step);

            display.update();
            display.addSnake(snake);
            display.render();
        }
    }
}
