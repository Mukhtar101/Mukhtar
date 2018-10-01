import java.util.Scanner;

public class Tipedata_ArrayLong {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		long[] Angka = new long [6];
		
		// Inisialisasi Value
		Angka[0] = 50;
		Angka[1] = 60;
		
		// Penggunaannya dalam operasi
		Angka[2] = (Angka[0] + Angka[1] - Angka[0]) * Angka[1];
		
		// Menampilkan nilainya
		System.out.println("Hasil Penggunaan Tipe Data Array Long : "+Angka[2]);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka 1 : ");
		Angka[3] = sc.nextLong();
		System.out.print("Input Angka 2 : ");
		Angka[4] = sc.nextLong();
		Angka[5] = Angka[3] * Angka[4];
		System.out.print("Hasil Angka 1 x Angka 2 : "+Angka[5]);
	}
	

}
