package pbo2.pkg10119073.latihan38.perhitunganlingkaran;

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

public class perhitunganLingkaran {
    public static void main(String[] args) {
        Lingkaran circle = new Lingkaran();
        System.out.println("=====Perhitungan Lingkaran=====");
        circle.validasiInput();
        circle.hasilPerhitungan(circle.diameter);
    }
    
}
