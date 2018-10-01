import java.util.Scanner;

public class Tipedata_Byte {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		byte X;
		byte Y;
		byte A, B;
		
		// Inisialisasi Value
		X = 4;
		Y = 5;
		
		// Penggunaannya dalam operasi
		int Z = X * Y + X - Y;
		
		// Menampilkan nilainya
		System.out.println ("Hasil Penggunaan Tipe Data Byte : "+Z);
		
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka A : ");
		A = sc.nextByte();
		System.out.print("Input Angka B : ");
		B = sc.nextByte();
		int C = A * B;
		System.out.print("Hasil A x B   : "+C);
	}

}
