/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author Hp Victus
 */
public class MainKendaraanHierarki {
    public static void main(String[] args) {
        System.out.println("=== HIERARKI KENDARAAN DARAT ===");

        Mobil mobil = new Mobil();
        mobil.nama = "Honda Civic";
        mobil.kecepatanMaksimal = 200;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();

        System.out.println("--------------------------------");

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Kawasaki Ninja";
        motor.kecepatanMaksimal = 160;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "2-Tak";
        motor.tampilkanInfo();
    }
}