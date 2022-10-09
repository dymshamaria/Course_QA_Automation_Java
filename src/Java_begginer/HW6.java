package Java_begginer;

    public class HW6 {

        static int numberTask = 1;

        public static void printTask() {
            System.out.print("\n" + "Task № " + numberTask++ + "________________________________________" + "\n");
        }

        static int numberTest = 1;

        public static void printTest() {
            System.out.print("\n" + "*" + "Test № " + numberTest++ + "*" + "\n");
        }

        //__________________________________________________________________________________

        //8.
//    public static short MinMax(short min, short max) {
//        for (int i = min; i < max; i += 15001) {
//            System.out.print(i + "\t");
//        }
//    }

        //9.
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_RESET = "\u001B[0m";

        //10.
        public static double parameterAll(double start, double end, double step) {
            for (double i = start; i <= end; i += step) {
                System.out.println(i);
            }

            return end;
        }

        //11.
        public static char parameterNM(char n, char m) {
            for (char i = n; n <= m; i++) {
                System.out.print(i + "\t");
            }
            return m;
        }

        //12.
        public static int parameterL(int l) {
            for (int i = 0; i <= l; i += 2) {
                System.out.println(i + "\t");
            }
            return l;
        }

        //13.

        public static int NumberN(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "\t");
            }

            return  n;
        }

        //__________________________________________________________________________________
        public static void main(String[] args) {

            //1.Распечатать последовательность чисел от 0 до 9 включительно.
            printTask();
            for (int i = 0; i <= 9; i++) {
                System.out.print(i + "\t");
            }

            //2.Распечатать последовательность чисел от 10 исключительно до 0 включительно.
            printTask();
            for (int i = 9; i >= 0; i--) {
                System.out.print(i + "\t");
            }

            //3.Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
            printTask();
            for (int i = 50; i <= 55; i += 2) {
                System.out.print(i + "\t");
            }

            //4.Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
            printTask();
            for (int i = 327; i >= 300; i -= 7) {
                System.out.print(i + "\t");
            }

            //5.Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
            printTask();
//        double a = 0.1;
//        for (int i=12; i<=13; i+=0.1){
//            System.out.print(i + "\t");
//        }

            //6.Распечатать последовательность четных чисел от 215 до 237 включительно
            printTask();
            for (int i = 215; i <= 237; i++) {
                System.out.print(i + "\t");
            }

            //7.Распечатать последовательность чисел, кратных 7,
            // в промежутке от 7 исключительно до 14 исключительно.
            printTask();
            for (int i = 8; i < 14; i++) {
                System.out.print(i + "\t");
            }

            //8.Распечатать последовательность которая начинается с минимального значения типа данных short
            // и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.
            printTask();
            short min = -32768;
            short max = 32767;
            for (int i = min; i < max; i += 15001) {
                System.out.print(i + "\t");
            }
//        System.out.println(MinMax(-32768, 32767));

            //9.Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11,
            // должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо распечатать словом ZERO.
            printTask();
            for (int i = -10; i < 34; i++) {
                if (i % 12 == 0 && i != 0) {
                    System.out.print(ANSI_BLUE + i + "\t" + ANSI_RESET);
                } else if (i % 11 == 0 && i != 0) {
                    System.out.print(ANSI_RED + i + "\t" + ANSI_RESET);
                }
            }

            //10.Написать метод, который принимает на вход параметры start,  end, step,
            // и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.
            printTask();
            parameterAll(0.1, 0.9, 0.2);

            //11.Написать метод, который принимает на вход параметры n и m типа char,
            // и выводит на печать последовательность букв английского алфавита в промежутке между значениями n и m включительно.
            printTask();
            System.out.print(parameterNM('n', 'm'));

            //12.Написать метод, который принимает параметр  и печатает  последовательность четных чисел от нуля. Длина последовательности = .
            printTask();
            parameterL(5);

            //13.Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
            printTask();
            NumberN(4);

            //14.Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
            printTask();
//        long a = 012345678900112233445566778899000L;
//        for (long i=a; i>=9999; i--){
//            System.out.println(i);
//        }

            //15.




            //__________________________________________________________________________________
            //Auto Test
            printTest();

        }
    }



}
