package t4;

public class Output {
    public static void main(String[] args) {
        Output o = new Output();
        o.go();
    }

    public void go() {
        int y = 7;

        for (int x = 0; x < 8; x++) {
            y++;

            if (x > 4) {
                System.out.print(++y + " ");
            }

            if (y > 14) {
                System.out.println(" x = " + x);
            }
        }
    }
}
