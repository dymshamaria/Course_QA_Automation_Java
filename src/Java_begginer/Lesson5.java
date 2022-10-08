package Java_begginer;

public class Lesson5 {
    //HW4.4
    public static void printKLMActions(int parameter1, int parameter2, String varName1, String varName2) {
        int quotient = parameter1 / parameter2;
        int remainder = parameter1 % parameter2;

        System.out.println(
                "Результат деления " + varName1 + " на " + varName2 + " = "
                        + quotient + ", а остаток от деления = " + remainder
        );
    }

    public static String returnKLMActions(int parameter1, int parameter2, String varName1, String varName2) {
        int quotient = parameter1 / parameter2;
        int remainder = parameter1 % parameter2;

        String result = "Результат деления " + varName1 + " на " + varName2 + " = "
                + quotient + ", а остаток от деления = " + remainder;

        return result;
    }

    public static int doubleTheValue(int a) {
        int result = a * 2;

        return result;
    }

    public static int tripleTheValue(int a) {
        int result = a * 3;

        return result;
    }

    public static int countAveSpeed(double distance, double time) {
        int result = (int) (distance / time);

        return result;
    }

    //___________________________________________________________________________
    //1..
    static int tcNumber = 1;

    public static void printTCNumber() {

        System.out.println("TC_" + tcNumber++ + "\t -- \t");
    }

    public static void printTestResult(String value) {
        System.out.println(value);
        System.out.println();
    }

    int expectedResult;
    int actualResult;

    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        } else {

            return "Fail";
        }
    }

    public static int findMaxOutTwo(int a, int b) {
        int max;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }

    public static int findMaxOutTwo1(int a, int b) {

        return Math.max(a, b);
    }

    public static int findMaxOutTwo3(int a, int b) {
        if (a >= b) {

            return a;
        } else {

            return b;
        }
    }

//    public static int findMaxOutOfFour(int a, int b, int c, int d) {
//        int max;
//        int max1;
//        if (a >= b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c >= d) {
//            max1 = c;
//        } else {
//            max1 = d;
//        }
//
//        if (max >= max1) {
//
//            return max;
//        } else {
//            max1;
//        }
//    }


    public static int findMaxOutOfFour1(int a, int b, int c, int d) {
        int max;

        if (a >= b) {
            max = a;
        } else {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        if (max < d) {
            max = d;
        }

        return max;
    }


    public static int findMaxOutOfFour2(int a, int b, int c, int d) {

        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    public static int findMaxOutOfFour3(int a, int b, int c, int d) {

        return findMaxOutTwo(a, findMaxOutTwo(b, findMaxOutTwo(c, d)));
    }


    //Написать метод, который принимает на вход число от 1 до 12 и возвращает название месяца.
    public static String returnMonth(int number) {
        if (number > 0 && number < 13) {
            if (number == 1) {

                return "January";
            }
            if (number == 2) {

                return "February";
            }
            if (number == 3) {

                return "March";
            }
            if (number == 4) {

                return "April";
            }
            if (number == 5) {

                return "May";
            }
            if (number == 6) {

                return "June";
            }
            if (number == 7) {

                return "July";
            }
            if (number == 8) {

                return "August";
            }
            if (number == 9) {

                return "September";
            }
            if (number == 10) {

                return "October";
            }
            if (number == 11) {

                return "November";
            }
            if (number == 12) {

                return "December";
            }
        }

        return "Error";
    }

    //Написать метод, который получает на вход расстояние ( десятичное число) и возвращает расстояние
    //в киломметрах и метрах в в иде текста ".... км...м"

    public static String evaluateDistance(double distance) {

        int km = (int) distance;
        int m = (int) (distance - km * 1000);

        return "" + km + " km " + m + " m";
    }


    //______________________________________________________________________________
    //HW4.4
    public static void main(String[] args) {
//        int k = 20;
//        int l = 10;
//        int m = 5;
//        printKLMActions(k, l, "k", "l");
//        printKLMActions(k, m, "k", "m");
//        printKLMActions(l, m, "l", "m");
//        printKLMActions(m, k, "m", "k");

//        System.out.println(returnKLMActions(k, l, "k", "l"));
//
//        String text = returnKLMActions(k, l, "k", "l") + returnKLMActions(k, m, "k", "m");
////        System.out.println(doubleTheValue(6));
//
//        int b = doubleTheValue(6);
//        System.out.println(b);
//
//        System.out.println(tripleTheValue(5));
//
//        int sum = doubleTheValue(6) + tripleTheValue(5);
//
//        System.out.println(sum);

//        System.out.println(text);
//
//        System.out.println("text " + 6);
//        String text1 = returnKLMActions(k, l, "k", "l") + doubleTheValue(6);
//        System.out.println(text1);

//        String text2 = printKLMActions(k, l, "k", "l" );
//
//        int total = countAveSpeed(200.45, 1.5) + countAveSpeed(12.5, 2.75);
//        System.out.println(total);

        //__________________________________________
//        System.out.println(findMaxOutTwo(5, 9));
//        System.out.println(findMaxOutTwo(3, 3));
//        System.out.println(findMaxOutTwo(9, 5));
//
//        System.out.println(findMaxOutTwo1(5, 9));
//        System.out.println(findMaxOutTwo1(3, 3));

        //Auto Test


        //TC_1*******
        //AAA - triple "A" правило для создания автоматизированного тест кейса

        //A - arrange (объявить все данные, которые нам известны)
//        int a = 5;
//        int b = 9;
//        int expectedResult = 9;
//
//        // Act - произвести какие-то действия (н-р, вызвать метод) для получения actual result
//
//        int actualResult = findMaxOutTwo(a, b);
//
//        // A - assert - сравнение expectedResult c actualResult и вывод о том, прошел тест или упал
//
//        verifyEquals(expectedResult, actualResult);
//
//        //отчет (report)
//        printTCNumber();
//        printTestResult(verifyEquals(expectedResult, actualResult));
//
//
//        //TC_2********
//        a = 3;
//        b = 3;
//        expectedResult = 6;
//        actualResult = findMaxOutTwo(a, b);
//
//        verifyEquals(expectedResult, actualResult);
//
//        //отчет (report)
//        printTCNumber();
//        printTestResult(verifyEquals(expectedResult, actualResult));
//
//
//        //TC_3******
//        a = 10;
//        b = 5;
//        expectedResult = 10;
//
//        actualResult = findMaxOutTwo(a, b);
//        verifyEquals(expectedResult, actualResult);
//
//        //отчет (report)
//        printTCNumber();
//        printTestResult(verifyEquals(expectedResult, actualResult));
//
//
//        //TC_4******
//        int number = 5;
//        String expectedResultString = "May";
//
//        String actualResultString = returnMonth(number);
//        verifyEquals(expectedResultString, actualResultString);
//
//        //отчет (report)
//        printTCNumber();
//        printTestResult(verifyEquals(expectedResultString, actualResultString));
//
//
//        //TC_5******
//        int number = 13;
//        String expectedResultString = "Error";
//
//        String actualResultString = returnMonth(number);
//        verifyEquals(expectedResultString, actualResultString);
//
//        //отчет (report)
//        printTCNumber();
//        printTestResult(verifyEquals(expectedResultString, actualResultString));
//
//        System.out.println(20.5 * 1000 % 10);
//        System.out.println((int)(20.5));
//        System.out.println((int)(20.5 - (int)(20.5)) * 1000);
//
//
//        //TC_6******
//        double distance = 6.004;
//        expectedResultString = "6 km 4 m";
//
//        actualResultString = evaluateDistance(distance);
//
//        verifyEquals(expectedResultString, actualResultString);
//
//        //отчет (report)
//        printTCNumber();
//        printTestResult(verifyEquals(expectedResultString, actualResultString));
//
//        System.out.println((evaluateDistance(distance)));
    }
}
