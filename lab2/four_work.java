package lab2;

import java.util.Scanner;

public class four_work {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        if (number >= 5 && number <= 10) {
            System.out.println("Число удовлетворяет условию");
        } else {
            System.out.println("Число не удовлетворяет условию");
        }
    }
}
