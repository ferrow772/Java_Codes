package com.sunbeam;

import com.tester.Box;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height , width and depth");
        Box b1 = new Box(sc.nextDouble() , sc.nextDouble(),sc.nextDouble());
        b1.displaydims();

        b1.calculatevolume();
        b1.displayvolume();

        System.out.println("This commit testing");
        System.out.println("This is third commit");





    }
}
