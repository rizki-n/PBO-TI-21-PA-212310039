package praktikum_02_selection_repetetion;
import java.util.Scanner;
public class latihan03 {

	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);

       System.out.println("Menu Sarapan : ");
       System.out.println("1. Nasi Goreng"); 
       System.out.println("2. Bubur Ayam");
       System.out.println("3. Soto Ayam");

       System.out.println("");
       System.out.print("Masukkan Nomor Pesanan : ");
       int inNomor = input.nextInt();

       if (inNomor == 1)
       {
           System.out.println("Anda memesan Nasi Goreng dengan harga Rp22.000,-");
       }
           else if (inNomor == 2)
           {
               System.out.println("Anda memesan Bubur Ayam dengan harga Rp15.000,-");
           }
               else if (inNomor == 3)
               {
                   System.out.println("Anda memesan Soto Ayam dengan harga Rp25.000,-");
               }
       else
       {
        System.out.println("menu yang Anda masukan salah.");
       }

      }

}

