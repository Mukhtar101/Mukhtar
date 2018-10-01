import java.util.Scanner;

public class Tipedata_String {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		String X;
		String Y;
		String Z;
		String A, B, C, D;
		
		// Inisialisasi Value
		X = "Luar biasa kawan... ";
		Y = "Lanjutkan Perjuanganmu!!!";
		
		// Penggunaannya dalam operasi
		Z = X.concat(Y);
		
		// Menampilkan nilainya
		System.out.println(Z);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Pesan 1 : " );
		A = sc.nextLine();
		System.out.print("Pesan 2 : ");
		B = sc.nextLine();
		C = A.concat(B);
		System.out.println("Hasil Pesan 1 + Pesan 2 : " +C);
	}

}
