import java.util.Scanner;

public class Tipedata_ArrayInteger {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		int[] Angka = new int [6];
		
		// Inisialisasi Value
		Angka[0] = 20;
		Angka[1] = 10;
		
		// Penggunaannya dalam operasi
		Angka[2] = (Angka[0] + Angka[1] - Angka[0]) * Angka[1];
		
		// Menampilkan nilainya
		System.out.println("Hasil Penggunaan Tipe Data Array Integer : "+Angka[2]);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka 1 : ");
		Angka[3] = sc.nextInt();
		System.out.print("Input Angka 2 : ");
		Angka[4] = sc.nextInt();
		Angka[5] = Angka[3] * Angka[4];
		System.out.print("Hasil Angka 1 x Angka 2 : "+Angka[5]);
	}

}
