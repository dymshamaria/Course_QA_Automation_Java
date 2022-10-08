package Java_middle;

public class HW1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int delA = a / b;
        int delB = b / a;

        System.out.println("Сложение: " + (a + b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Остаток от деления: " + (a % b));

        if (a % 2 == 0) {
            System.out.println(a + " - это число четное");
        } else {
            System.out.println(a + " - это число нечетное");
        }
        if (b % 2 == 0) {
            System.out.println(b + " - это число четное");
        } else {
            System.out.println(b + " - это число нечетное");
        }




        String emoji = "\uD83D\uDE09";
        System.out.println(emoji);


    }
}
