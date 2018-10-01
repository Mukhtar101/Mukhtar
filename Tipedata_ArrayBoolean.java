import java.util.Scanner;

public class Tipedata_ArrayBoolean {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		boolean[] B = new boolean [5];
				
		// Inisialisasi Value
		B[0] = true;
		B[1] = false;
		
		// Penggunaannya dalam operasi
		B[2] = (50>70)? true:false;
		B[3] = (50>40)? true:false;
		
		// Menampilkan nilainya
		System.out.println("Apakah True/False bahwa 50 lebih besar dari 70 : "+B[2]);
		System.out.println("Apakah True/False bahwa 50 lebih besar dari 40 : "+B[3]);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input Angka 1 : ");
//		Number[3] = sc.nextFloat();
//		System.out.print("Input Angka 2 : ");
//		Number[4] = sc.nextFloat();
//		Number[5] = Number[3] / Number[4];
//		System.out.print("Hasil Angka 1 / Angka 2 : "+Number[5]);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Apakah kamu Rajin ? (true/false)");
		B[4] = sc.nextBoolean();
		if (B[4] == true) {
		System.out.println("Jawaban = Ya, Kamu Rajin!!!" );
		}
		else {
		System.out.println("Jawaban = Tidak, Kamu tidak Rajin!!!" );
		}

	}
}
