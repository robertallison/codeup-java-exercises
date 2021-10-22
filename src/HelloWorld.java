public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        int myFavoriteNumber = 4;
        System.out.println(myFavoriteNumber);
//
//        String myString = "This is my string";
//        System.out.println(myString);

//        String myString = 'r';
//wants char

        String myString = "3.14159";
        System.out.println(myString);
        //this runs

        long myNumber;
        myNumber = 123;
        System.out.println(myNumber);

        //long has to be an integer
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //because pluses are before x, auto adds before giving original variable

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
//        its trying to assign incompatible types

//        int x = 4;
//        x = x + 5;
//
//        int x = 3;
//        int y = 4;
//        y = y * x;

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;

    }
}
