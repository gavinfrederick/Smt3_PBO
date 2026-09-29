/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_6;

/**
 *
 * @author Hp Victus
 */
// File: Main.java

public class Main {
    public static void main(String[] args) {
        // Polimorfisme Runtime & Overriding
        Hewan hewan1 = new Kucing();
        hewan1.bersuara(); // Output: Meow

        Hewan hewan2 = new Anjing();
        hewan2.bersuara(); // Output: Woof

        // Overloading
        Kucing kucing = new Kucing();
        kucing.makan("ikan");         // Memanggil makan(String)
        kucing.makan("ikan", 2);      // Memanggil makan(String, int)

        Anjing anjing = new Anjing();
        anjing.makan("daging", 3);    // Memanggil makan(String, int)
    }
}