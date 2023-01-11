package Snake;

public class Display {
    private int row = 5;
    private int cell = 5;
    private String[][] grid = new String[this.row][this.cell];

    public Display() {
        this.reset();
    }

    public void render() {
        for (int i = 0; i < this.row; i++) {
            System.out.print("|");

            for (int j = 0; j < this.cell; j++) {
                System.out.print(this.grid[i][j] + "|");
            }

            System.out.println();
        }
    }

    public void reset() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.cell; j++) {
                this.grid[i][j] = " ";
            }
        }
    }

    public void update() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.cell; j++) {
                if (!this.grid[i][j].equals("*")) {
                    this.grid[i][j] = " ";
                }
            }
        }
    }

    public int[] center() {
        int[] center = {
            (this.row / 2),
            (this.cell / 2),
        };
        return center;
    }

    public void addSnake(Snake snake) {
        if (this.grid[snake.cellPosition][snake.rowPosition].equals("*")) {
            this.generateFood();
        }

        this.grid[snake.cellPosition][snake.rowPosition] = "x";
    }

    public void generateFood() {
        boolean success = false;

        while (!success) {
            int row = (int) (Math.random() * (this.row - 1));
            int cell = (int) (Math.random() * (this.cell - 1));

            if (!this.grid[cell][row].equals("x")) {
                this.grid[cell][row] = "*";
                success = true;
            }
        }
    }
}
