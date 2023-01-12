package t3;

public class Mix {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;

        Mix[] ma = new Mix[20];

        int x = 0;

        while (x < 19) { // +
            ma[x] = new Mix();
            ma[x].counter++;
            count++;
            count += ma[x].maybeNew(x);
            x++;
        }

        System.out.println(count + " " + ma[1].counter);
    }

    public int maybeNew(int index) {
        if (index < 1) {  // +
            Mix m = new Mix();
            m.counter++;

            return 1;
        }

        return 0;
    }
}
