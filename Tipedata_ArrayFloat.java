import java.util.Scanner;

public class Tipedata_ArrayFloat {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		float[] Number = new float [6];
		
		// Inisialisasi Value
		Number[0] = 15;
		Number[1] = 4;
		
		// Penggunaannya dalam operasi
		Number[2] = (Number[0] + Number[1]) * Number[1];
		
		// Menampilkan nilainya
		System.out.println("Hasil Penggunaan Tipe Data Array Double : "+Number[2]);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Angka 1 : ");
		Number[3] = sc.nextFloat();
		System.out.print("Input Angka 2 : ");
		Number[4] = sc.nextFloat();
		Number[5] = Number[3] / Number[4];
		System.out.print("Hasil Angka 1 / Angka 2 : "+Number[5]);
	}

}
