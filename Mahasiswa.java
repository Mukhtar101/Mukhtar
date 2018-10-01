import java.util.Scanner;

public class Mahasiswa{
	// Deklarasi Variabel
    public String nim; 
    public Mahasiswa(String nama){
        System.out.println("Nama Mahasiswa : "+nama); 
    }
    public void setNim(String nim){
        this.nim = nim; 
    }
    public String getNim(){
        return nim; 
    }

    public static void main(String[] args){
    //membuat objek 
    Mahasiswa mukhtar = new Mahasiswa("Mukhtar") ;
   
    //mengakses method 
    mukhtar.setNim("D0217337");
    mukhtar.getNim();
   
    //mengakses variable
    System.out.println("NIM            : "+mukhtar.nim);
    } 
}
