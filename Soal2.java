package soal50;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("GENAP");
        } else {
            System.out.println("GANJIL");
        }

    }

}
