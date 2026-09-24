import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        int a;
        int max = 0, min = 9;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<3; i++){
            System.out.print("Masukan bilangan bulat: ");
            a = sc.nextInt();
            if(a>max){
                max = a;
            }
            if(a<min){
                min = a;
            }

        }
        System.out.println("Max: " + max + "\nMin: " + min);
    }
    
}
