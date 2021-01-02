package com.company;

//5x5

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int height = 5;
        int width = 5;
        Main.printDiamond(height, width);
    }

    private static void printDiamond(int height, int width) {
        int size = height + width;
        
        System.out.println("Romb");
        int z = 1;
        for (int i = 0; i < size / 2; i++) {
            int prob = (size - z) / 2;
            for (int j = 0; j < prob; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < z; k++) {
                System.out.print("*");
            }
            System.out.println();
            z = z + 2;
        }
        z = size -1;
        for (int i = size / 2; i > 0; i--) {
            int prob = (size - z) / 2;
            for (int j = 0; j < prob; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < z; k++) {
                System.out.print("*");
            }
            System.out.println();
            z = z - 2;
        }
    }
}
