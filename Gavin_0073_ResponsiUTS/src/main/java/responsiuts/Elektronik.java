/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts;

/**
 *
 * @author Hp Victus
 */
// Kelas turunan dari Produk
public class Elektronik extends Produk {
    private int garansi; // dalam tahun

    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga); // memanggil konstruktor induk
        this.garansi = garansi;
    }

    public int getGaransi() { return garansi; }
    public void setGaransi(int garansi) { this.garansi = garansi; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // cetak nama & harga dari induk
        System.out.println("Garansi: " + garansi + " tahun");
    }
}