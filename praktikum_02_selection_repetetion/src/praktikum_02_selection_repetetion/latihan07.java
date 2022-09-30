package praktikum_02_selection_repetetion;
import java.util.Scanner;

class restoran {
	private long harga;
	
	public void pilihMenu() {
		Scanner input = new Scanner(System.in);
		boolean ulang = true;
		String pilih;
		int pilihanMenu;
		
		while(ulang) {
			System.out.println("====PILIH MENU====\n");
			System.out.println("Menu Sarapan:");
			System.out.println("1. Nasi Goreng \n2. Bubur Ayam \n3. Soto Ayam ");
			System.out.print("Pilihan : ");
			pilihanMenu = input.nextInt();
			
			getPrices(pilihanMenu);
			
			System.out.print("\nApakah Anda ingin memesan lagi? [Y/N] : ");
			pilih = input.next();
			
			if(pilih.equalsIgnoreCase("Y")) {
				continue;
			} else if(pilih.equalsIgnoreCase("N")) {
				System.out.println("Terima kasih telah memesan");
				break;
			} else {
				System.out.println("Pilihan yang Anda masukkan salah!");
			}
		}
		input.close();
	}
	
	private long getPrices(int pilih) {
		switch(pilih) {
			case 1:
				harga = 22000;
				System.out.println("Harga Nasi Goreng = Rp " + harga);
			break;
			case 2:
				harga = 15000;
				System.out.println("Harga Bubur Ayam = Rp " + harga);
			break;
			case 3:
				harga = 25000;
				System.out.println("Harga Soto Ayam = Rp " + harga);
			break;
			default:
				System.out.println("Pilihan tidak ada");
		}		
		return pilih;
	}
}

public class latihan07 {
	
	public static void main(String[] args)  {
		restoran restoran = new restoran();
		
		restoran.pilihMenu();		
	}

}