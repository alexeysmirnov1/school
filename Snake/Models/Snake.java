package Snake.Models;

import java.util.ArrayList;
import java.util.HashMap;

public class Snake implements Model {
    private static int xHeadPosition;
    private static int yHeadPosition;

    private static boolean grow = false;

    private static ArrayList<int[]> tail = new ArrayList<int[]>();

    public void setPosition(int x, int y) {
        this.moveTail(Snake.xHeadPosition , Snake.yHeadPosition);

        Snake.xHeadPosition = x;
        Snake.yHeadPosition = y;

        Snake.grow = false;
    }

    public void moveTail(int x, int y) {
        int[] prev = {x, y};
        if (!Snake.grow) {
            for (int[] part : Snake.tail) {
                int[] current = {part[0], part[1]};
                part[0] = prev[0];
                part[1] = prev[1];
                prev = current;
            }
        }
    }

    public ArrayList<String> data() {
        return new ArrayList<String>();
    }

    public int[] headPosition() {
        int[] coords = {Snake.xHeadPosition, Snake.yHeadPosition};
        return coords;
    }

    public ArrayList<int[]> body() {
        ArrayList<int[]> body = new ArrayList<int[]>();

        int[] headPosition = {Snake.xHeadPosition, Snake.yHeadPosition};
        body.add(headPosition);
        body.addAll(Snake.tail);

        return body;
    }

    public void grow() {
        Snake.grow = true;

        ArrayList<int[]> body = new ArrayList<int[]>();
        int[] headPosition = {Snake.xHeadPosition, Snake.yHeadPosition};
        body.add(headPosition);

        body.addAll(Snake.tail);

        Snake.tail = body;
    }
}
