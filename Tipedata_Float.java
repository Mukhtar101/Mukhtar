import java.util.Scanner;

public class Tipedata_Float {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		float X;
		float Y;
		float Z;
		float A, B, C;
		
		// Inisialisasi Value
		X = 50;
		Y = 100;
		
		// Penggunaannya dalam operasi
		Z = X / Y;
		
		// Menampilkan nilainya
		System.out.println ("Hasil Penggunaan Tipe Data Float : "+Z);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka A : ");
		A = sc.nextFloat();
		System.out.print("Input Angka B : ");
		B = sc.nextFloat();
		C = A / B;
		System.out.print("Hasil A / B   : "+C);
	}
}
