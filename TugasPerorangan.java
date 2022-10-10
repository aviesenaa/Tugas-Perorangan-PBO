package tugas.perorangan;


import java.util.Scanner;

public class TugasPerorangan {
    public static void main(String[] args) {
        String nama, nim;
        int quiz, tugas, tubes, uts, uas;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Nama : ");
        nama = keyboard.nextLine();
        
        System.out.print("\nNim : ");
        nim = keyboard.nextLine();
        
        System.out.print("\nMasukkan nilai Quiz : ");
        quiz = keyboard.nextInt();
        
        System.out.print("\nMasukkan nilai Tugas : ");
        tugas = keyboard.nextInt();
        
        System.out.print("\nMasukkan nilai Tubes : ");
        tubes = keyboard.nextInt();
        
        System.out.print("\nMasukkan nilai UTS : ");
        uts = keyboard.nextInt();
        
        System.out.print("\nMasukkan nilai UAS : ");
        uas = keyboard.nextInt();
        
        double total_nilai= (0.1*quiz)+(0.1*tugas)+(0.3*tubes)+(0.25*uts)+(0.25*uas);
        System.out.println("\nNilai Matakuliah Pemograman Berorientasi Objek : "+total_nilai);
        
        
    }
}
