import java.util.Scanner;

public class Tipedata_Double {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		double X;
		double Y;
		double Z;
		double A, B, C;
		
		// Inisialisasi Value
		X = 10.10;
		Y = 20.20;
		
		// Penggunaannya dalam operasi
		Z = X * Y;
		
		// Menampilkan nilainya
		System.out.println ("Hasil Penggunaan Tipe Data Double : "+Z);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka A : ");
		A = sc.nextDouble();
		System.out.print("Input Angka B : ");
		B = sc.nextDouble();
		C = A * B;
		System.out.print("Hasil A * B   : "+C);
		
	}

}
