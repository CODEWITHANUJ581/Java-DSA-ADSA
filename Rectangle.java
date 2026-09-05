package DSA.Pattern;

import java.util.Scanner;

public class Rectangle {
    public static void main (String[] args){
//        for (int row=1; row<=4; row++){
//            for (int col=1; col<=10; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//     -------Print Rectangle with input--------//
        System.out.print("Input row: ");
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        System.out.print("Input col: ");
        sc = new Scanner(System.in);
        int B = sc.nextInt();
        for (int row=1; row<=A; row++){
            for (int col=1; col<=B; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}