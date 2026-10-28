/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Hp Victus
 */
public class MainTugas {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan Kucing dan Anjing
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        // Memanggil metode suara() masing-masing objek
        kucing.suara();
        anjing.suara();
    }
}