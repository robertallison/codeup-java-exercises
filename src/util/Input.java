package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Return string: ");
        String anyString = scanner.nextLine();
        return anyString;
    }
    public boolean yesNo() {
        if (scanner.hasNext("yes")) {
            return true;
        }
        return false;
    }
    public int getInt(int min, int max) {
        int user;
        do {
            System.out.printf("Please type a number within %s and $s", min, max);
            user = scanner.nextInt();
        } while ((user > max || user < min));
        return user;
    }
    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double user;
        do {
            System.out.printf("Please type a number within %s and $s", min, max);
            user = scanner.nextInt();
        } while ((user > max)|| (user < min));
        return user;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
    public static void main(String[] args) {
        Input input = new Input();
        input.getString();
        System.out.println(input.getString());
    }
}


