/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;
/**
 *
 * @author Hp Victus
 */
public class Kendaraan1 {
    //Atribut dengan akses modifier berbeda
    private String nama;            //Hanya bisa diakses dalam kelas ini
    protected int kecepatanMaks;      //Bisa diakses di package yang sama dan subclass
    public String jenisMesin;      //Bisa diakses dari mana saja
    
    //constructor
    public Kendaraan1(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    //Getter dan Setter untuk merek
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    //Method public untuk nemapilkan informasi kendaraan
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin" + jenisMesin);
    }
}

