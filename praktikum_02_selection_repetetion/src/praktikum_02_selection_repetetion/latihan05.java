package praktikum_02_selection_repetetion;
import java.util.Scanner;

public class latihan05 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    System.out.print("Masukan Jumlah Baris : ");
    int n = input.nextInt();
    int a, b, c;
    
    int i = 1;
    while (i <= n) {
         a = i;
         while (a <= n) {
            System.out.print("*");
            a++;
         }
         b = 1;
         while (b <= i * 2 - 2) {
            System.out.print(" ");
            b++;
         }
         c = i;
         while (c <= n) {
            System.out.print("*");
            c++;
         }
         System.out.println();
         i++;
        }

     i = 1;
     while (i <= n) {
         a = 1;
         while (a <= i) {
            System.out.print("*");
            a++;
         }
         b = i * 2 - 2;
         while (b < n * 2 - 2) {
            System.out.print(" ");
            b++;
         }
         c = 1;
         while (c <= i) {
            System.out.print("*");
            c++;
         }
            System.out.println();
            i++;
        }

        input.close();
    }
}