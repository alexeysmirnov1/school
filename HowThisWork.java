public class HowThisWork {
    public static void main(String[] args) {
        String[] pets = {"Фидо", "Зевс", "Бин"};
        String[] types = {"старая", "молодая"};
        String[] nature = {"злая", "добрая"};

        int rand1 = (int) (Math.random() * pets.length);
        int rand2 = (int) (Math.random() * types.length);
        int rand3 = (int) (Math.random() * nature.length);

        String dog = pets[rand1] + " - собака"
            + " " + types[rand2]
            + " " + nature[rand3];

        System.out.println(dog);
    }
}