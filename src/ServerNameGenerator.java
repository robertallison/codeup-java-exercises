import java.util.Arrays;
public class ServerNameGenerator {

    public static String[] adjectives = {"Good", "Terrifying","Happy","Spirited","Broke","Random","Godly","Jumping","Crazy","Spooky"};
    public static String[] nouns = {"Dog","Hamster","Tiger","Lion","House","Frog","Toad","Dragon","Crocodile","Dove"};

    public static String randomCombo(String[] array) {
        int randomNumber = (int) (Math.random() * array.length);
        return array[randomNumber];
    }

    public static void main(String[] args) {
        System.out.println(randomCombo(adjectives) + " " + randomCombo(nouns));
    }
}
