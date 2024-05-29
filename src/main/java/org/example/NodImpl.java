package org.example;

import java.util.Scanner;

public class NodImpl implements Nod {

    /**
     * Запрашивает и позволяет пользователю ввести два целых числа
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите два целых числа");
        int num1 = (int) input.nextDouble();
        int num2 = (int) input.nextDouble();
        int gcd = calculate(num1, num2);
        System.out.println("Наибольший общий делитель чисел " + num1 + " и " + num2 + " равен " + gcd);
    }


    /**
     *  Вычисляет наибольший общий делитель двух целых чисел a и b
     * @param a первое целое число
     * @param b второе целое число
     * @return наибольший общий делитель чисел a и b
     */

    public static int calculate(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override

    /**
     * Метод для отображения наибольшего общего делителя двух чисел
     */
    public void showNod() {

    }
}


