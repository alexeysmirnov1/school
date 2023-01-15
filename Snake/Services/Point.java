package Snake.Services;

public class Point {
    public static boolean equals(int[] first, int[] second) {
        return (first[0] == second[0] && first[1] == second[1]);
    }

    public static int[] generateRandomPoint(int sizeMap) {
        int[] position = {
            (int) (Math.random() * (sizeMap)),
            (int) (Math.random() * (sizeMap))
        };

        return position;
    }
}