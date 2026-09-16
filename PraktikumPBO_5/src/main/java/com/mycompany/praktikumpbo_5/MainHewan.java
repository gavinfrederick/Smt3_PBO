/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author Hp Victus
 */
public class MainHewan {
    public static void main(String[] args) {
        System.out.println("=== DATA HEWAN ===");
        
        Kucing kucing1 = new Kucing("Mimi");
        kucing1.tampilkanInfo();

        System.out.println("--------------------");

        Anjing anjing1 = new Anjing("Buddy");
        anjing1.tampilkanInfo();
    }
}