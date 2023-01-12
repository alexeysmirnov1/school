package t5;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells = new ArrayList<>();
    private String name;

    public void setLocationCells(ArrayList<String> cells) {
        this.locationCells = cells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";

        int index = this.locationCells.indexOf(userInput);

        if (index >= 0) {
            this.locationCells.remove(index);

            if (this.locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }

        return result;
    }
}
