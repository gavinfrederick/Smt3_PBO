/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts;

/**
 *
 * @author Hp Victus
 */
public class Main {
    public static void main(String[] args) {
        // POLIMORFISME: referensi bertipe induk memegang objek turunan
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Produk produk2 = new Makanan("Snack", 15000, "2026-12-30");
        Produk produk3 = new Makanan("Kinderjoy", 20000, "2026-11-29");

        Pegawai pegawai1 = new PegawaiTetap("Budi", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
        Pegawai pegawai3 = new PegawaiKontrak("Hasbi", 2500000, 6);

        System.out.println("1. Output Produk");
        produk1.tampilkanInfo();   // versi Elektronik dipanggil
        produk2.tampilkanInfo();
        produk3.tampilkanInfo();

        System.out.println("\n2. Output Pegawai");
        pegawai1.tampilkanInfo();  // versi PegawaiTetap dipanggil
        pegawai2.tampilkanInfo();
        pegawai3.tampilkanInfo();
        

        System.out.println("\n3. Output Polimorfisme");
        produk2.tampilkanInfo();   // versi Makanan dipanggil
        pegawai2.tampilkanInfo();  // versi PegawaiKontrak dipanggil
    }
}