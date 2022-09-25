package Java_middle;

public class HW2 {
    public static void main(String[] args) {
        String task = "Task № ";
        int number = 1;
        System.out.println(task + number);
        int a = 1;
        int b = 2;
        if (a == b) {
            System.out.println((a == b) + " переменные равны");
        } else if (a < 2) {
            System.out.println((a < b) + " переменная 1 меньше 2");
        } else if (a > b) {
            System.out.println((a > b) + " переменная 2 меньше 1");
        }


        String task1 = "Task № ";
        int number1 = 2;
        System.out.println(task1 + number1);
        int a1 = 3;
        int b1 = 4;
        int ab = a1 + b1;
        if (ab % 2 == 0) {
            System.out.println(ab + " - сумма переменных четная");
        } else {
            System.out.println(ab + " - сумма переменных нечетная");
        }

        String task2 = "Task № ";
        int number2 = 3;
        System.out.println(task2 + number2);
        //1
        int a2 = 11;
        if (a2 > 10) {
            System.out.println(" - если переменная больше 10");
        }
        //2
        int a3 = 80;
        if (a3 < 100) {
            System.out.println(" - если переменная меньше 100");
        }
        //3
        int a4 = 100;
        if (a4 / 2 > 20) {
            System.out.println(" - если это соответствует истине");
        }
        //4
        int a5 = 23;
        if ((a5 >= 5 && a5 <= 40)) {
            System.out.println(" - если это правда");
        }
        //5
        int a6 = 55;
        if (a6 < 5 || a6 > 40) {
            System.out.println(" - если условие ложно");
        }

        String task3 = "Task № ";
        int number3 = 4;
        System.out.println(task3 + number3);
        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }


        String task4 = "Task № ";
        final int numberForTask = 5;
        final int maxNumber = 10000;
        System.out.println(task4 + numberForTask);
        int grade = 1;
        boolean isConditionalTrue;

        do {
            int result = (int) Math.pow(numberForTask, grade);
            isConditionalTrue = result < maxNumber;
            if (isConditionalTrue) {
                System.out.println(result);
                grade++;
            }
        } while (isConditionalTrue);

        String task5 = "Task № ";
        int number5 = 6;
        System.out.println(task5 + number5);
        //a
        for (int i = 40; i <= 60; i++) {
            if (i % 4 ==0 ) {
                System.out.println(i);
            }
        }
        //b
        for (int i=40; i <= 60; i=i+6){
            System.out.println(i);
            }
        }
    }




