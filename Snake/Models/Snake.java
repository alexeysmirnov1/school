package Snake.Models;

import java.util.ArrayList;
import java.util.HashMap;

public class Snake implements Model {
    private static int xHeadPosition;
    private static int yHeadPosition;

    private static boolean grow = false;

    private static ArrayList<int[]> tail = new ArrayList<int[]>();

    public void setPosition(int x, int y) {
        Snake.xHeadPosition = x;
        Snake.yHeadPosition = y;

        this.moveTail();

        Snake.grow = false;

        System.out.println(tail.size());
    }

    public void moveTail() {
        if (!Snake.grow) {
            //
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
