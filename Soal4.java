package soal50;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        if (a >= 65) {
            System.out.print("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }
}
