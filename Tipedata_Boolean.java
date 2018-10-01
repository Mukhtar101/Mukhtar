import java.util.Scanner;

public class Tipedata_Boolean {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		boolean X;
		boolean Y;
		boolean Z;
		boolean jawaban;
		
		// Inisialisasi Value
		X = true;
		Y = false;
		
		// Penggunaannya dalam operasi
		Z = X && Y; // Konjungsi (dan)
		
		// Menampilkan nilainya	
		System.out.println ("Hasil X Konjungsi Y = "+Z);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Apakah kamu Cantik ? (true/false)");
		jawaban = sc.nextBoolean();
		if (jawaban == true) {
		System.out.println("Jawaban = Ya, Kamu Cantik!!!" );
		}
		else {
		System.out.println("Jawaban = Tidak, Kamu tidak Cantik!!!" );
		}
		
		
	}

}
