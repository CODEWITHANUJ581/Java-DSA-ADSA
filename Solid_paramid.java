package DSA.Pattern;

public class Solid_paramid {
    public  static void main(String[] args){
        int n=5;
        for (int row=1; row<=n; row++){
            for (int spc=1; spc<=n-row;spc++){
                System.out.print(" ");
            }
                for (int col=1; col<=2*row-1; col++){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
