import java.util.Scanner;

public class TipeDataPrimitiveInteger {

	public static void main(String[] args) {
		//contoh deklarasi variabel
		int A;
		int B;

		//contoh inisialisasi valuenya
		A = 12;
		B = 57;
		int C = 86;		

		//contoh penggunaannya dalam operasi
		int D = A + B * C / B + 22/7 - B;

		//contoh untuk menampilkan nilainya
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);

		//contoh input dari keyboard
		System.out.print("Masukkan bilangan integer: ");
		int E = new Scanner(System.in).nextInt();
		System.out.print("Bilangan integer yang anda masukkan adalah: ");
		System.out.println(E);

	}

}
