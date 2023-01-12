package t5;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        two.setName("eToys.com");

        DotCom three = new DotCom();
        three.setName("Go2.com");

        this.dotComsList.add(one);
        this.dotComsList.add(two);
        this.dotComsList.add(three);

        System.out.println("Ваша цель - потопить три \"Сайта\".");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet: this.dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
//            System.out.println(newLocation.toString());
        }
    }

    private void startPlaying() {
        while (! this.dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }

        this.finishGame();
    }

    private void checkUserGuess(String userGuess) {
        this.numOfGuesses++;

        String result = "Мимо";

        for (DotCom dotComToTest : this.dotComsList) {
            result = dotComToTest.checkYourself(userGuess);

            if (result.equals("Попал")) {
                break;
            }

            if(result.equals("Потопил")) {
                this.dotComsList.remove(dotComToTest);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все \"Сайты\" ушли ко дну! Ваши акции теперь ничего не стоя.");

        if (this.numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + this.numOfGuesses + " попыток.");
            System.out.println("Вы успели выбаться до того, как ваши вложения утонули.");
        } else {
            System.out.println("Это заняло у вас довольно много времени. " + this.numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }
}
