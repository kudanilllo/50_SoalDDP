package soal50;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan pertama: ");
        a = sc.nextInt();
        System.out.print("Bilangan kedua: ");
        b = sc.nextInt();

        // operasi
        int hasil1 = a + b;
        int hasil2 = a - b;
        int hasil3 = a * b;
        double hasil4 = a / b;

        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
        System.out.println(hasil4);

    }

}
