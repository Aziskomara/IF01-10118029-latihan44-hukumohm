/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan44.hukumohm;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Hukum Ohm
 */
public class baterai {
    
    private float kuatarus;
    private float hambatan;

    public baterai() {
        System.out.println("=====Hukum OHM=====");
        System.out.println("Kuat Arus yang Mengalir pada suatu kawat penghantar");
        System.out.println("Akan berbanding lurus dengan beda potensial");
        System.out.println("Pada ujung-ujung kawatpenghantar tersebuat");
        System.out.println("asalkan suhu kawat dijaga Konstan");
    }

    public baterai(float kuatarus, float hambatan) {
        this.kuatarus = kuatarus;
        this.hambatan = hambatan;
        
        System.out.println("\nKuat Arus : " + kuatarus + "\tAmpere");
        System.out.println("Hambatan  : " + hambatan + " Ohm");
        System.out.println("Hasil Tegangan : " + hitungTegangang() + " Volt");
    }

    public float getKuatarus() {
        return kuatarus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangang(){
        return kuatarus * hambatan;
    }
}
