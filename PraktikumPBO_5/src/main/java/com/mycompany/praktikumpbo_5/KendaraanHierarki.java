/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author Hp Victus
 */
class KendaraanHierarki {
    String nama;
    int kecepatanMaksimal;

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan     : " + nama);
        System.out.println("Kecepatan Maksimal : " + kecepatanMaksimal + " km/jam");
    }
}

// Level 2: Kelas Menengah (Mewarisi Kendaraan)
class KendaraanDarat extends KendaraanHierarki {
    int jumlahRoda;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda        : " + jumlahRoda);
    }
}

// Level 3a: Kelas Turunan Spesifik (Mewarisi KendaraanDarat)
class Mobil extends KendaraanDarat {
    int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu       : " + jumlahPintu);
    }
}

// Level 3b: Kelas Turunan Spesifik (Mewarisi KendaraanDarat)
class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin        : " + jenisMesin);
    }
}
