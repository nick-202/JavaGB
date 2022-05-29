package Lesson2;

public class Main {
    public static void main(String[] args) {
        inthe10on20(15, 4);
        isPositiveOrNigative(15);
        isNegativeOrPositive(-1);
        printWordNTimes("Java", 15);

    }

    public static void inthe10on20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void isPositiveOrNigative(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static void isNegativeOrPositive(int b) {
        if (b >= 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }

    public static void printWordNTimes(String word, int times) {
        for (times = 0; times < 11; times++) {
            System.out.println(word);
        }
    }
}