package praktikum_01_runtutan;

import java.util.Scanner;

public class Latihan09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataInput();
	}
	static void DataInput() {
	
		Scanner DataInput = new Scanner(System.in);
		Students myBio = new Students();
		System.out.println("Masukan Nama : ");
		String nama = DataInput.nextLine();
		String fullname = myBio.getFullName(nama);
		System.out.println("Masukan NPM : ");
		int nonpm = DataInput.nextInt();
		int npm = myBio.getnpm(nonpm);
		DataOutput(npm, fullname);
		
		DataInput.close();
	}
	static void DataOutput(int npm, String fullname) {
		System.out.println("============OUTPUT===========");
		Students myBio = new Students();
		System.out.println("Nama     : "+fullname);
		System.out.println("NPM      : "+npm);
		String ClassName = myBio.getClassName("TI-21-PA");
		System.out.println("Kelas    : "+ClassName);
		int semester = myBio.getsemester(3);
		System.out.println("Semester : "+semester);
		double ipk = myBio.getipk(3.99);
		System.out.println("IPK      : "+ipk);
		
	}

}
