package t2;

public class Player {
    int number = 0;

    public void guess() {
        this.number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
}
