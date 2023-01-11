package Snake;

public class Snake {
    public int rowPosition;
    public int cellPosition;

    public void toStart(int[] startPosition) {
        this.rowPosition = startPosition[0];
        this.cellPosition = startPosition[1];
    }

    public void doStep(String step) {
        if (step.equals("w")) {
            this.cellPosition--;
            if (this.cellPosition < 0) {
                this.cellPosition = 0;
            }
        }

        if (step.equals("s")) {
            this.cellPosition++;
            if (this.cellPosition > 4) {
                this.cellPosition = 4;
            }
        }

        if (step.equals("a")) {
            this.rowPosition--;
            if (this.rowPosition < 0) {
                this.rowPosition = 0;
            }
        }

        if (step.equals("d")) {
            this.rowPosition++;
            if (this.rowPosition > 4) {
                this.rowPosition = 4;
            }
        }
    }
}
