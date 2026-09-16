/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author Hp Victus
 */
class Hewan {
    String nama;
    String jenis;

    // Konstruktor
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis     : " + jenis);
    }
}

// Kelas Turunan: Kucing
class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama, "Mamalia (Karnivora)");
    }

    // Metode suara khas
    public void bersuara() {
        System.out.println("Suara     : Meong... Meong!");
    }

    // Overriding tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
    }
}

// Kelas Turunan: Anjing
class Anjing extends Hewan {

    public Anjing(String nama) {
        super(nama, "Mamalia (Karnivora)");
    }

    // Metode suara khas
    public void bersuara() {
        System.out.println("Suara     : Guk... Guk!");
    }

    // Overriding tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
    }
}