/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruang;

/**
 *
 * @author NanditaPutri
 */
import java.util.Scanner;
public class BangunRuang {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        double luasPermukaan = hitungLuasPermukaan(panjang, lebar, tinggi);
        double volume = hitungVolume(panjang, lebar, tinggi);

        System.out.println("Luas Permukaan Balok: " + luasPermukaan);
        System.out.println("Volume Balok: " + volume);
    }

    public static double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        // Rumus luas permukaan balok
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public static double hitungVolume(double panjang, double lebar, double tinggi) {
        // Rumus volume balok
        return panjang*lebar*tinggi;
    }

}
