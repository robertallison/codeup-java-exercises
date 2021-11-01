package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Return string: ");
        String anyString = scanner.nextLine();
        return anyString;
    }

    public static void main(String[] args) {
        Input input = new Input();
        input.getString();
        System.out.println(input.getString());
    }
}


