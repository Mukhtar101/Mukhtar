import java.util.Scanner;

public class Tipedata_Char {
	
	public static void main(String[] args) {
		// Deklarasi Variabel
		char t;
		char a;
		char m;
		char v;
		char n;
		char A, B, C, D, E;
		
		// Inisialisasi Value
		t = 'T';
		a = 'A';
		m = 'M';
		v = 'V';
		n = 'N';

		// Menampilkan nilainya	
		System.out.println("My name is : "+t+a+m+v+a+n);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		// Input dari keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Char F : ");
		A = sc.next().charAt(0);
		System.out.print("Input Char A : ");
		B = sc.next().charAt(0);
		System.out.print("Input Char L : ");
		C = sc.next().charAt(0);
		System.out.print("Input Char S : ");
		D = sc.next().charAt(0);
		System.out.print("Input Char E : ");
		E = sc.next().charAt(0);
		System.out.println("Apakah benar TAMVAN ? :"+A+B+C+D+E);
}
	

}
