import java.util.Scanner;

public class Tipedata_ArrayShort {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		short[] Nilai = new short [4];
		
		// Inisialisasi Value
		Nilai[0] = 80;
		Nilai[1] = 70;
		
		// Penggunaannya dalam operasi
		int Hasil = Nilai[0] + Nilai[1] - Nilai[0] * Nilai[1];
		
		// Menampilkan nilainya
		System.out.println("Hasil Penggunaan Tipe Data Array Short : " +Hasil);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka 1 : ");
		Nilai[2] = sc.nextShort();
		System.out.print("Input Angka 2 : ");
		Nilai[3] = sc.nextShort();
		int Hasilx  = Nilai[2] * Nilai[3];
		System.out.print("Hasil Angka 1 x Angka 2 : "+Hasilx);
	}

}
