package DSA.Pattern;

import java.util.Scanner;

public class Inverted_right_angle_triangle {
    public static void main(String[] args){
        int n=5;
        for (int row=1; row<=n; row++){
            for (int col=row; col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }

//-----------Take input then print same pattern------------//
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        for (int row=1; row<=num; row++){
            for (int col=row; col<=num; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
