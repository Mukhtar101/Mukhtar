import java.util.Scanner;

public class Tipedata_Integer {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		int D, E, F;
		int X;
		int Y;
		int Z;
		
		// Inisialisasi Value
		X = 4;
		Y = 6;
		
		// Penggunaannya dalam operasi
		Z = X * Y + Y - X / X;
		
		// Menampilkan nilainya
		System.out.println (X);
		System.out.println (Y);
		System.out.println (Z);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka D : ");
		D = sc.nextInt();
		System.out.print("Input Angka E : ");
		E = sc.nextInt();
		F = D * E;
		System.out.print("Hasil D x E   : "+F);
	}

}
