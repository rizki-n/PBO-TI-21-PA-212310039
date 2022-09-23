package praktikum_01_runtutan;

import java.time.LocalDate;
import java.util.Scanner;

public class Latihan10 {

	public static void main(String[] args) {
		double hasil, diskon, Sub_total;
		int Jmlh;
		Scanner myObj = new Scanner(System.in);
		LocalDate myDate = LocalDate.now();
		
		System.out.println("Masukan Jumlah Produk Yang dibeli : ");
		Jmlh = myObj.nextInt();
		hasil=Jmlh * 6300;;
		
		myObj.close();
		
		
		
		System.out.println("==========================");
		System.out.println(""+"TOKO SERBAGUNA IBIK"+"");
		System.out.println("==========================");
		System.out.println();
		Students myBio = new Students();
		String nama = myBio.getFullName("Riki N");
		System.out.println("Member = " +nama);
		System.out.println("==========================");
		System.out.println("Jumlah Produk Yang dibeli : "+Jmlh);
		
		System.out.println();
		
		System.out.println(myDate);
		System.out.println("ITEM"+"      "+"QTY"+"   "+"HARGA"+"  "+"  TOTAL");
		System.out.println("=====================================");
		System.out.println("ROTI ENAK "+Jmlh+"   Rp 6.300"+"   "+"Rp"+hasil);
		
		if(Jmlh % 3==0) {
			diskon = hasil * 0.10;
			Sub_total = hasil - diskon;
			System.out.println("Diskon : 10%");
			System.out.println("Sub Total : "+Sub_total);
		}else {
			System.out.println("Sub Total : "+hasil);
		}

	}

}
