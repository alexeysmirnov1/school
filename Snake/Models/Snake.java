package Snake.Models;

import java.util.ArrayList;
import java.util.HashMap;

public class Snake implements Model {
    private static int xHeadPosition;
    private static int yHeadPosition;

    private static ArrayList<Integer[]> tail = new ArrayList<Integer[]>();

    public void setPossition(int x, int y) {
        Snake.xHeadPosition = x;
        Snake.yHeadPosition = y;

        this.moveTail();
    }

    public void moveTail() {
        //
    }

    public ArrayList<String> data() {
        return new ArrayList<String>();
    }
//    public int rowPosition;
//    public int cellPosition;
//
//    private ArrayList<String> output = new ArrayList<String>();
//
//    public void toStart(int[] startPosition) {
//        this.rowPosition = startPosition[0];
//        this.cellPosition = startPosition[1];
//    }
//
//    public ArrayList<String> data() {
//        ArrayList<String> lines = new ArrayList<String>();
//        return lines;
//    }
//
//    public void doStep(String step) {
//        if (step.equals("w")) {
//            this.cellPosition--;
//            if (this.cellPosition < 0) {
//                this.cellPosition = 0;
//            }
//        }
//
//        if (step.equals("s")) {
//            this.cellPosition++;
//            if (this.cellPosition > 4) {
//                this.cellPosition = 4;
//            }
//        }
//
//        if (step.equals("a")) {
//            this.rowPosition--;
//            if (this.rowPosition < 0) {
//                this.rowPosition = 0;
//            }
//        }
//
//        if (step.equals("d")) {
//            this.rowPosition++;
//            if (this.rowPosition > 4) {
//                this.rowPosition = 4;
//            }
//        }
//    }
}
