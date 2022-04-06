package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите числа:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        double s;
        s = 0;
        double p = Math.sqrt((Math.pow(x, 2) + (Math.pow(y, 2)) + (Math.pow(z, 2))));
        s = s + p;
        System.out.println(s);

    }
}
