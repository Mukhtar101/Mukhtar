import java.util.Scanner;

public class Tipedata_ArrayDouble {
	
	public static void main(String[] args) {
		
		// Deklarasi Variabel
		double[] Angka = new double [6];
		
		// Inisialisasi Value
		Angka[0] = 25.5;
		Angka[1] = 10.4;
		
		// Penggunaannya dalam operasi
		Angka[2] = (Angka[0] + Angka[1]) * Angka[1];
		
		// Menampilkan nilainya
		System.out.println("Hasil Penggunaan Tipe Data Array Double : "+Angka[2]);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka 1 : ");
		Angka[3] = sc.nextDouble();
		System.out.print("Input Angka 2 : ");
		Angka[4] = sc.nextDouble();
		Angka[5] = Angka[3] * Angka[4];
		System.out.print("Hasil Angka 1 x Angka 2 : "+Angka[5]);
		
	}
}
