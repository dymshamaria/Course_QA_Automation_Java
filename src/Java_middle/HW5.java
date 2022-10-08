package Java_middle;

public class HW5 {

    //1.
//    public static int countSheeps(Boolean[] arrayOfSheeps) {
//        int count = 0;
//        for (int i = 0; i < arrayOfSheeps.length; i++) {
//            if (arrayOfSheeps[i] != null) {
//                if (arrayOfSheeps[i] == true) {
//                    count++;
//                }
//            } else {
//
//                return count;
//            }
//        }
//
//        return count;
//    }
//
//
//    public static void main(String[] args) {
//        Boolean array1[] = {true, true, true, false,
//                true, true, true, true,
//                true, false, true, false,
//                true, false, false, true,
//                true, true, true, true,
//                false, false, true, true};
//        System.out.println(countSheeps(array1));
//    }

//          //3.
//    public static boolean isLove(final int flower1, final int flower2) {
//        if ((flower1 % 2 == 0 && flower2 % 2 != 0) || (flower2 % 2 == 0 && flower1 % 2 != 0)){
//
//            return true;
//        }
//
//        return false;
//    }
//    public static void main(String [] args){
//        System.out.println(isLove(0, 1));
//    }

//    //4.
//    public static String numberToString(int num){
//        return Integer.toString(num);
//    }

//    //5.
//    public static int findSmallestInt(int[] args){
//        int min = args[0];
//        for (int i=0; i < args.length; i++){
//            if (min> args[i]){
//                min = args[i];
//            }
//        }
//
//        return min;
//    }

    //6.
    public static String countingSheep(int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < num; i++) {
            str.append(i + 1 + " sheep...");
        }

        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(1));
    }

}

