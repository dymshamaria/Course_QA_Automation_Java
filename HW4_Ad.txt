package Java_middle;

public class HW4 {
    public static void main(String[] args) {
        //1.
        hw42();
        //2.
        hw43();
        //3.
        hw44();
        //4. Необходимо написать 4 метода:
        //сложение 2х чисел
        //вычитание 2х чисел
        //умножение 2х чисел
        //деление 2х чисел
        int a = 4;
        int b = 2;
        System.out.println(String.format("a=%d,b=%d,a+b=%d", a, b, add(a, b)));
        System.out.println(String.format("a=%d,b=%d,a+b=%d", a, b, sub(a, b)));
        System.out.println(String.format("a=%d,b=%d,a+b=%d", a, b, divide(a, b)));
        System.out.println(String.format("a=%d,b=%d,a+b=%d", a, b, multiply(a, b)));
    }

    //______________________________________________________________________
    //1.
    private static void hw42() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    //2.
    private static void hw43() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n");
    }

    //3.
    private static void hw44() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + "  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        System.out.println("\n");
    }

    //4.
    private static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}
