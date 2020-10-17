/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * NAMA  : Diva Sabila Ramadhan 
 * KELAS : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program Kambing Global
 */
public class KambingGlobal {
    // variabel jumlahKambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
        
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
       KambingGlobal kambingSusu = new KambingGlobal();
       
       // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
       kambingSusu.getJumlahKambing();
       
       // Menambah satu kambing
       kambingSusu.tambahKambing();
       
       // Menampilkan jumlah kambing yang ada
       kambingSusu.getJumlahKambing();
    }
    
}
