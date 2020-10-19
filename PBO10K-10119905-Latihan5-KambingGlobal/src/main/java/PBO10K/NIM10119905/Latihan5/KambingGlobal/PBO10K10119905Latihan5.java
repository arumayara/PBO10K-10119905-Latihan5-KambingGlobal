/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan5.KambingGlobal;

/**
 *
 * @author
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program ini untuk pengaksesan variabel global
 * 
 */
public class PBO10K10119905Latihan5 {
    
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing setelah ditambah: "+ jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing +5;
        System.out.println("Jumlah Kambing setelah ditambah: "+ jumlahKambing);
    }

    public static void main(String[] args) {
        PBO10K10119905Latihan5 kambingSusu = new PBO10K10119905Latihan5();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
