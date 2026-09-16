/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package praktikum5;
/**
 *
 * @author Hp Victus
 */

//Kelas Induk
public class Kendaraan {
    String nama;
    int kecepatan;
    
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + "km/jam");
    }
}

//Kelas Turunan Mobil
class Mobil extends Kendaraan {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

//Kelas Turunan Sepeda Motor
class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

//public class Main {
//    public static void main (String[] args) {
//        Mobil Mobil = new Mobil();
//        Mobil.nama = "Toyota Yaris";
//        Mobil.kecepatan = 180;
//        Mobil.jumlahPintu = 4;
//        Mobil.tampilkanInfo();
//        
//        SepedaMotor Motor = new SepedaMotor();
//        Motor.nama = "Yamaha Ninja SS";
//        Motor.kecepatan = 120;
//        Motor.jenisMesin = "2-Tak";
//        Motor.tampilkanInfo();
//    }
//}