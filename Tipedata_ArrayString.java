import java.util.Scanner;

public class Tipedata_ArrayString {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		String[] Pesan = new String[6];
		
		// Inisialisasi Value
		Pesan[0] = "Luar biasa kawan... ";
		Pesan[1] = "Jangan menyerah!!!";
		
		// Penggunaannya dalam operasi
		Pesan[2] = Pesan[0].concat(Pesan[1]);
		
		// Menampilkan nilainya
		System.out.println(Pesan[2]);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan Pesan 1 : ");
		Pesan[3] = sc.nextLine();
		System.out.print("Masukkan Pesan 2 : ");
		Pesan[4] = sc.nextLine();
		Pesan[5] = Pesan[3].concat(Pesan[4]);
		System.out.println("Hasil Pesan 1 + Pesan 2 : " +Pesan[5]);
	}
}
