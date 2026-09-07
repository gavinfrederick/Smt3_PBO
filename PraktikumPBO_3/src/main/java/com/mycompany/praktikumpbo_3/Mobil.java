/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;
/**
 *
 * @author Hp Victus
 */
public class Mobil {
    // Atribut private
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    // Constructor
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Getter dan Setter
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    // Method untuk mengubah warna mobil
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method perilaku mesin
    public void startEngine() {
        System.out.println("Mesin mobil " + this.merk + " menyala");
    }

    // Method untuk menampilkan detail data mobil
    public void displayInfo() {
        System.out.println("Merk  : " + this.merk);
        System.out.println("Model : " + this.model);
        System.out.println("Tahun : " + this.tahun);
        System.out.println("Warna : " + this.warna);
        System.out.println("---------------------------");
    }
}