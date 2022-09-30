package praktikum_02_selection_repetetion;
import java.util.Scanner;
public class latihan04 {
	
	public static void main(String[] args) {
	int hasil = 1, i;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Masukan nilai faktorial : ");
	int angka = input.nextInt();
	
	
	if(angka < 20) {
		System.out.println("Nilai kurang dari 20!!");
	}else {
		System.out.print(" Faktor dari "+angka+" Adalah"+" = ");
		for(i=angka;i>=1;i--) {
		
			String k = (angka%i==0)? i+", ":"" ;
			System.out.print(k);
		}
	}
	
	}
}
