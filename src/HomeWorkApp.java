public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a = 7;
        int b = 9;
        if (a >= b) { //если "а" больше или равно "b"
            System.out.println("a >= b");
        }
        if (a < b) { //если "а" меньше "b"
            System.out.println("a < b");
        }
    }

    private static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }

    private static void checkSumSign() {
        int a = 15;
        int b = 25;
        int Sum = (a + b);
        if (Sum >= 0) {
            System.out.println("The amount is positive"); //Пишу на английском, тк в выводе русский не отображается.
        }
        if (Sum < 0) {
            System.out.println("The amount is negative");
        }
    }

    public static void printThreeWords (){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
}
