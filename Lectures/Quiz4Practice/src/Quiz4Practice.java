import java.util.Scanner;

public class Quiz4Practice {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//   '         }
//            System.out.println();
//        }
//
//        for (int i = 5; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 5; i > 0; i--) {
//            for (int k = 0; k < i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("|+|");
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i < 6; i++) {
//            for (int k = 0; k < i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("|+|");
//            }
//            System.out.println();
//        }

//        int nRows;
//        Scanner console = new Scanner(System.in);
//
//        System.out.print("Please enter an odd-number of output-lines (enter zero to exit the program): ");
//        nRows = console.nextInt();
//
//        for (int i = 0; i < nRows; i++) {
//            for
//        }
//
//
//        for(int row=1; row<=nRows; row++ )
//        {
//            for(int column = 1; column<=nRows-row; column++)
//                System.out.print(" ");
//            for(int column = 1; column<= row*2-1; column++)
//                System.out.print("*");
//            System.out.println();
//        }

//                int i, j, k, n = 8;
//
//                for (i = 1; i <= n; i++) {
//                    for (j = 1; j < i; j++) {
//                        System.out.print(' ');
//                    }
//
//                    for (k = i; k <= n; k++) {
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }
//
//                for (i = n - 1; i >= 1; i--) {
//                    for (j = 1; j < i; j++) {
//                        System.out.print(' ');
//                    }
//                    for (k = i; k <= n; k++) {
//                        System.out.print("* ");
//                    }
//
//                    System.out.println();
//                }

        for (int i = 0; i < 6; i++) {
            for (int j = 5-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
