/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;
/**
 *
 * @author Hp Victus
 */
public class Hewan {
    // Atribut private (enkapsulasi)
    private String nama;
    private int umur;

    // Constructor
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    // Getter dan Setter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    // Method perilaku
    void suara() {
        System.out.println("Hewan bersuara");
    }
    void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur() + " tahun");
    }
    void berlari() {
        System.out.println("Hewan sedang berlari");
    }
}