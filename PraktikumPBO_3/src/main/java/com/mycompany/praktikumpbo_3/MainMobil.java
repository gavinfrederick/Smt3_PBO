/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Hp Victus
 */
public class MainMobil {
    public static void main(String[] args) {
        // 1. Instansiasi 2 objek Mobil
        Mobil mobil1 = new Mobil("Toyota", "Corolla", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Putih");

        // 2. Menyalakan mesin dan menampilkan info mobil 1
        mobil1.startEngine();
        mobil1.displayInfo();

        // 3. Menyalakan mesin dan menampilkan info mobil 2
        mobil2.startEngine();
        mobil2.displayInfo();

        // 4. Modifikasi atribut warna menggunakan setter lalu tampilkan ulang
        System.out.println("== Setelah Perubahan Warna Mobil 1 ==");
        mobil1.setWarna("Merah Metalik");
        mobil1.displayInfo();
    }
}