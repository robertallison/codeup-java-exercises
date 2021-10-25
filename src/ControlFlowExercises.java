import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//
//            System.out.println(i + ", ");
//            i++;
//        }

//        int i = 2;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        int i = 2;
//        do {
//            i *= i;
//            System.out.println(i);
//
//        } while (i <= 1000000);

//        for(int i = 1; i <= 100; i += 1){
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }
//            else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            }
//            else{
//                System.out.println(i);
//            }
//        }

        Scanner userInput = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//        int theNumber = userInput.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");

        System.out.println("Would you like to convert your number to a grade? yes/no");
        String input;
        int grade;
        while (true) {
            input = userInput.nextLine();
            if (input.equals("no")) {
                System.out.println("Fine!");
                break;
            } else if (input.equals("yes")) {
                System.out.println("Okay, please input a number");
                System.out.println("Please type in a number between 0-100 to receive a grade for that number.");
                grade = userInput.nextInt();
                if (grade >= 99) {
                    System.out.println("A+");
                } else if (grade <= 98 && grade >= 95) {
                    System.out.println("A");
                } else if (grade <= 94 && grade >= 90) {
                    System.out.println("A-");
                } else if (grade <= 89 && grade >= 88) {
                    System.out.println("B+");
                } else if (grade <= 87 && grade >= 85) {
                    System.out.println("B");
                } else if (grade <= 84 && grade >= 80) {
                    System.out.println("B-");
                } else if (grade <= 79 && grade >= 78) {
                    System.out.println("C+");
                } else if (grade <= 77 && grade >= 75) {
                    System.out.println("C");
                } else if (grade <= 74 && grade >= 70) {
                    System.out.println("C-");
                } else {
                    System.out.println("F");
                }
                System.out.println("Would you like to try a new number?");
                userInput.nextLine();
            } else {
                System.out.println("Please enter a valid integer");
                System.out.println("Would you like to continue? yes/no");
            }
        }

    }
}

