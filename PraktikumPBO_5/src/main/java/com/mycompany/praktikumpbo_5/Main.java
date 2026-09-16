/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

import praktikum5.Mobil;
import praktikum5.SepedaMotor;

/**
 *
 * @author Hp Victus
 */
public class Main {
    public static void main (String[] args) {
        Mobil Mobil = new Mobil();
        Mobil.nama = "Toyota Yaris";
        Mobil.kecepatan = 180;
        Mobil.jumlahPintu = 4;
        Mobil.tampilkanInfo();
        
        SepedaMotor Motor = new SepedaMotor();
        Motor.nama = "Yamaha Ninja SS";
        Motor.kecepatan = 120;
        Motor.jenisMesin = "2-Tak";
        Motor.tampilkanInfo();
    }
}