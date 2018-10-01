import java.util.Scanner;

public class Tipedata_Short {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		short X;
		short Y;
		short A, B;
		
		// Inisialisasi Value
		X = 6;
		Y = 5;
		
		// Penggunaannya dalam operasi
		int Z = X - Y + X * Y;
		
		// Menampilkan nilainya
		System.out.println ("Hasil Penggunaan Tipe Data Short : "+Z);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka A : ");
		A = sc.nextShort();
		System.out.print("Input Angka B : ");
		B = sc.nextShort();
		int C = A * B;
		System.out.print("Hasil A x B   : "+C);
	}

}
