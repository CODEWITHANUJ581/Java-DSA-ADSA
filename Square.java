package DSA.Pattern;

import java.util.Scanner;

public class Square {
    public static void main(String[] args){

//---------------Cheating-------------//
//        int a =4;
//        for (int row=0; row<=a; row++){
//            for (int col=0; col<=a; col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//--------------Self---------------//

//        for (int row=0; row<=4; row++){
//            for (int col=0; col<=4; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//-------------Print with input------------//
        System.out.print("Input number: ");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for (int row=0; row<=A; row++){
            for (int col=0; col<=A; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

