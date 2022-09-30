package praktikum_02_selection_repetetion;
import java.util.Scanner;
public class latihan02 {

	public static void main(String[] args) {
		int bil;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukan Npm Anda : ");
		bil = input.nextInt();
		
		if(bil%1==1&&bil%1==0){
			System.out.println("Bukan Bilangan Prima");
		}else {
			System.out.println("Adalah bilangan prima");
		}
	}

}
