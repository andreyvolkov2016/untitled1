package ru.mrcpk.java01.example01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java programm!");

        int z = method1(10, 15);

        System.out.println("Result: z = " + z);
    }

    public static int method1(int x, int y) {
        return x * y;
    }
}
