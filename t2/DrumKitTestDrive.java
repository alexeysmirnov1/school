package t2;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();

        d.playTopHat();
        d.playSnare();

        d.snare = false;

        if (d.snare == true) {
            d.playSnare();
        }
    }
}
