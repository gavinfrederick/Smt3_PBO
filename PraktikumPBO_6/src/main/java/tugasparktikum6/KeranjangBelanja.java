/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tugasparktikum6;
// *
// * @author Hp Victus
// */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        listProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk p : listProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanRincian() {
        System.out.println("==================================================");
        System.out.println("               RINCIAN KERANJANG BELANJA          ");
        System.out.println("==================================================");
        for (Produk p : listProduk) {
            System.out.printf("- %-20s | Harga: Rp%-10.2f | Diskon: Rp%-8.2f | Akhir: Rp%.2f\n",
                    p.getNama(), p.getHarga(), p.hitungDiskon(), p.getHargaSetelahDiskon());
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("TOTAL BAYAR SETELAH DISKON: Rp%.2f\n", hitungTotalHargaSetelahDiskon());
        System.out.println("==================================================");
    }
}