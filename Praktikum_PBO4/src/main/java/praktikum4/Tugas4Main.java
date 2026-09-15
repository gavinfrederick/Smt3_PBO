/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4tugas;
/**
 *
 * @author Hp Victus
 */

public class Tugas4Main {
    public static void main(String[] args) {
        // Inisialisasi objek Pekerja
        Tugas4Pekerja pekerja1 = new Tugas4Pekerja("Budi Hartono", 28, "Software Engineer", 12500000);

        // Menampilkan informasi menggunakan toString()
        System.out.println("=== Informasi Awal ===");
        System.out.println(pekerja1.toString());

        // Mengubah nama menggunakan setter
        pekerja1.setNama("Budi Santoso");

        // Menampilkan ulang data setelah diubah
        System.out.println("\n=== Informasi Setelah Update Nama ===");
        System.out.println(pekerja1.toString());

        // Pengujian akses langsung atribut
        System.out.println("\n=== Percobaan Akses Langsung ===");
        
        // 1. Mencoba akses 'nama' (Akan ERROR bila di-uncomment)
        // System.out.println(pekerja1.nama); 

        // 2. Mencoba akses 'usia' (BERHASIL)
        System.out.println("Akses usia langsung: " + pekerja1.usia);

        // 3. Mencoba akses 'gaji' (Akan ERROR bila di-uncomment)
        // System.out.println(pekerja1.gaji);

        // 4. Mencoba akses 'pekerjaan' (BERHASIL)
        System.out.println("Akses pekerjaan langsung: " + pekerja1.pekerjaan);
    }
}
