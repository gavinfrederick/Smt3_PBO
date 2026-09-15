/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4tugas;

/**
 *
 * @author Hp Victus
 */

public class Tugas4Pekerja extends Tugas4Manusia {
    private double gaji;

    // Constructor
    public Tugas4Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return "Data Pekerja:" +
               "\nNama      : " + getNama() +
               "\nUsia      : " + usia + " tahun" +
               "\nPekerjaan : " + pekerjaan +
               "\nGaji      : Rp" + String.format("%,.2f", gaji);
    }
}