package Java_begginer;

public class Lesson4 {
//    public static void methodName(){
//
//    }

    //    public static void methodName(type argName, type argName){
//
//   }
//
//    public static void printLine(){
//        System.out.println("\t__________\n");
////    }
//
//    static String task = "\nЗадание № ";
//    static int number = 2;
//
//    public static void task() {
//        System.out.println(task + (number++));
//    }
//
//    public static void main(String[] args) {

    public static void main(String[] args) {
        //Андрей старше Светы и Наташа старше Светы
//        int ageA;
//        int ageN;
//        int ageS;
//
//        (ageA>ageS) && (ageN>ageS);

//        int a = 25;
//        int b = 7;
//        System.out.println(5 > 7);
//        System.out.println((a > b) || (a < b));
//
//        System.out.println(a != b);
//        System.out.println(a == b);

        //if-else
//        if (){
//
//        }else {
//
//        }
//        //if-if else - else
//        if (){
//
//        } else if(){
//        } else {
//    }
//        if (a == b) {
//            System.out.println(a + b);
//        }


//        if(a==b){
//            System.out.println(a + b);
//        } else {
//            System.out.println(a - b);
//        }

//
//        if(a == b) {
//            System.out.println(a + b);
//        } else if (a > b){
//            a = b;
//            System.out.println(a);
//        } else {
//            System.out.println(a - b);
//        }
//        int a = 0;
//        int b = 7;
//        int c = 25;
//
//        if((a>b) || (b < c)){
//            a=7;
//            int sum = b + c;
//            System.out.println("a= " + a);
//            System.out.println("sum = " + sum);
//        }  else {
//            a = 10;
//            System.out.println("a= " + a);
//        }


        int n = 20;

        if ((n % 2 != 0) && (n % 3 == 0)){
            n=0;
        } else if ((n % 2 != 0) && (n % 3 != 0)){
            n=10;
        } else if ((n % 2 == 0) && (100 % n == 0)){
            n=100;
        }

        //Test
        int expectedResult = 20;
        int actualResult = n;
        if ( actualResult == expectedResult){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

         Integer x = 12;
         Integer y = 20;
        System.out.println(x.equals(y));
        System.out.println(!(x.equals(y)));

        String hi1 = "hi";
        String hi2 = "hi";
        System.out.println(hi1.equals(hi2));


    }
}
