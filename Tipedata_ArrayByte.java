import java.util.Scanner;

public class Tipedata_ArrayByte {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		byte[] Angka = new byte [4];
		
		// Inisialisasi Value
		Angka[0] = 30;
		Angka[1] = 40;
		
		// Penggunaannya dalam operasi
		int Hasil = (Angka[0] + Angka[1] - Angka[0]) * Angka[1];
		
		// Menampilkan nilainya
		System.out.println("Hasil Penggunaan Tipe Data Array Byte : " +Hasil);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka 1 : ");
		Angka[2] = sc.nextByte();
		System.out.print("Input Angka 2 : ");
		Angka[3] = sc.nextByte();
		int Hasilx  = Angka[2] * Angka[3];
		System.out.print("Hasil Angka 1 x Angka 2 : "+Hasilx);
	}

}
