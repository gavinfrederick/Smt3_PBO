/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasparktikum6;

/**
 *
 * @author Hp Victus
 */
public class MainTugas {
    public static void main(String[] args) {
        Produk buku1 = new Buku("Pemrograman Java", 120000);
        Produk laptop = new Elektronik("Laptop Gaming", 12000000);
        Produk kemeja = new Pakaian("Kemeja Batik", 250000);

        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(kemeja);

        keranjang.tampilkanRincian();
    }
}