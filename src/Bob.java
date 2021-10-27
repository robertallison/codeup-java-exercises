import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Talk to Bob");
        String userInput;
        boolean confirm;

        do {
            System.out.println("Hello fellow human, I am Bob");
            userInput = sc.nextLine();
            if(userInput.endsWith("?")) {
                System.out.println("Sure");
            }else if (userInput.endsWith("!")) {
                System.out.println("Woah chill out");
            } else if (userInput.equals(" ")) {
                System.out.println("Fine be that way");
            } else {
                System.out.println("Whatever");
            }
            System.out.println("Would you like to keep talking (y/n)");
            String response = sc.nextLine();
            confirm = response.equals("y");
        } while (confirm);


    }
}
