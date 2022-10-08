package Java_middle;

/**
 *
 */
public class lesson2 {
    public static void main(String[] args) {
//        int a = 3;
//        int b = 7;
//
//        for (int i = 1; i > 0; i=i-1) {
//            System.out.println(i);
//            if (i==1){
//                break;
//            }
//        }

        for (int i = 0; i <= 5; i = i + 1) {
            System.out.print(i + "|" + " ");
            for (int j = 0; j <= 5; j = j + 1) {
                System.out.print(j + " ");
            }
        }
    }
}