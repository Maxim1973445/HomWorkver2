package org.example;

import java.util.Scanner;

public class NodImpl implements Nod {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Введите два целых числа");
        int num1 = (int) input.nextDouble();
        int num2 = (int) input.nextDouble();
        int gcd = calculate(num1, num2);
        System.out.println("Наибольший общий делитель чисел " + num1 + " и " + num2 + " равен " + gcd);
    }

    public static int calculate(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public void showNod() {

    }
}


