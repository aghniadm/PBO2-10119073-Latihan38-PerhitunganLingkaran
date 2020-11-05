package pbo2.pkg10119073.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan
 * lingkaran dengan object oriented
 *
 */

public class Lingkaran {
    public double diameter;
    public double jarijari;
    Scanner scanner = new Scanner(System.in);

    public void validasiInput() {
        String nilaiD;
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            nilaiD = scanner.nextLine();
            System.out.println((!nilaiD.matches("[0-9]*"))? 
                    "Nilai Diameter Tidak Sesuai\n":"");

        } while (!nilaiD.matches("[0-9]*"));
        diameter = Double.parseDouble(nilaiD);
    }
    
    public double hitungJarijari(double diameter){
        return diameter / 2;
    }
    
    public double hitungLuas(double jarijari){
        return Math.PI * (jarijari * jarijari);
    }
    
    public double hitungKeliling(double jarijari){
        return 2*(Math.PI * jarijari);
    }
    
    public void hasilPerhitungan(double diameter){
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran = %.2f cm %n", hitungJarijari(diameter));
        System.out.printf("Luas Lingkaran = %.2f cm %n", hitungLuas(hitungJarijari(diameter)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n", hitungKeliling(hitungJarijari(diameter)));
    }
}
