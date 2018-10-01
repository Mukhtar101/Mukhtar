import java.util.Scanner;

public class Tipedata_ArrayChar {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		char[] X = new char[12];
		
		// Inisialisasi Value
		X[0] = 'M';
		X[1] = 'U';
		X[2] = 'K';
		X[3] = 'H';
		X[4] = 'T';
		X[5] = 'A';
		X[6] = 'R';
		
		// Menampilkan nilainya
		System.out.println("My name is : "+X[0]+X[1]+X[2]+X[3]+X[4]+X[5]+X[6]);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan H : ");
		X[7] = sc.next().charAt(0);
		System.out.print("Masukkan A : ");
		X[8] = sc.next().charAt(0);
		System.out.print("Masukkan L : ");
		X[9] = sc.next().charAt(0);
		System.out.print("Masukkan O : ");
		X[10] = sc.next().charAt(0);
	//	X[11] = X[7]+X[8];
		System.out.println("" + X[7]+X[8]+X[9]+X[10]+"!!! "+X[0]+X[1]+X[2]+X[3]+X[4]+X[5]+X[6]);
	}

}
