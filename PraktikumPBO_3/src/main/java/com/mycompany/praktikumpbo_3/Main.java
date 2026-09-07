/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;
/**
 *
 * @author Hp Victus
 */
public class Main {
    public static void main(String[] args) {
        // Objek kucing
        Hewan kucing = new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();

        System.out.println();

        // Objek anjing
        Hewan anjing = new Hewan("Doggy", 2);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
}
