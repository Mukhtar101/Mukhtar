import java.util.Scanner;

public class Tipedata_Long {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
				long X;
				long Y;
				long Z;
				long A, B, C;
				
				// Inisialisasi Value
				X = 111111111;
				Y = 222222222;
				
				// Penggunaannya dalam operasi
				Z = X + Y;
				
				// Menampilkan nilainya
				System.out.println ("Hasil Penggunaan Tipe Data Long : "+Z);
				System.out.println("-------------------------------------");
				System.out.println("-------------------------------------");
				
				// Input dari keyboard
				Scanner sc = new Scanner(System.in);
				System.out.print("Input Angka A : ");
				A = sc.nextLong();
				System.out.print("Input Angka B : ");
				B = sc.nextLong();
				C = A * B;
				System.out.print("Hasil A x B   : "+C);
	}

}
