package com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i = i + 1) {
            System.out.print("hello ");
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) { // i = i + 1 => i++
            System.out.println("7 x " + i + " = " + 7 * i);
        }
        System.out.println("----------------");
        for (int n = 10; n > 0; n = n - 2) { // n = n - 2 => n-=2, n = n * 5 => n*=5
            System.out.println("9 x " + n + " = " + 9 * n);
        }

        int a = 0;
        while (a < 5) {
            System.out.println(" Hi " + a);
            a++;
        }

        String str = "*";
        while (str.length() < 5) {
            System.out.println(str);
            str = str + "*";
        }

        for (double i = 0.0; i < 1.0 && 1 == 1; i += 0.2) {
            System.out.println(i);
        }

        String[] robots = new String[12];
        for (int i = 0; i < robots.length; i++) {
            robots[i] = "Agent00" + (i + 1);
        }
        System.out.println(Arrays.toString(robots));

        String[] names = {"Nursultan", "Alibek", "Nazgul"};
        for (String currentElement : names) {
            System.out.println("Hello " + currentElement);
        }

        int b = 6;
        while (b < 0) {
            System.out.println("Java");
        }

        do {
            System.out.println("Geektech");
        } while (b < 0);

        int[] nums = {9, 15, 78, -35, 66, -23, 88};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                break;
            }
            System.out.println(nums[i]);
        }
        System.out.println("***************");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                continue;
            }
            System.out.println(nums[i]);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Внешний цикл " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Внутренний цикл " + j);
                for (int k = 0; k < 2; k++) {
                    System.out.println(k);
                }

            }
        }
    }
}
