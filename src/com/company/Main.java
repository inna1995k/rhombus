package com.company;

public class Main {

    public static void main(String[] args) {
        int height =11;
        int width = 6;
        Main.printDiamond(height, width);
    }

    private static void printDiamond(int height, int width) {
        System.out.println("Romb");
        int up = 1;
        for(int i=height/2; i>=1; i--) {
            for (int j = i; j >= 1; j--) {//отступы пустые по горизонтали
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j <= up - 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= up - 2; j++) {
                System.out.print(" ");
            }

            if (up != 1) {
                System.out.print("*");
            }
            up++;
            System.out.print("\n");
        }


        int low = height/2 -1;
        for(int i=1; i<=height/2 -1; i++){//i=1

            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int j=0; j<=low-2; j++){
                System.out.print(" ");
            }

            for(int j=0; j<=low-2; j++){
                System.out.print(" ");
            }

            if(low!=1){
                System.out.print("*");
            }

            low--;
            System.out.print("\n");
        }
    }
}
