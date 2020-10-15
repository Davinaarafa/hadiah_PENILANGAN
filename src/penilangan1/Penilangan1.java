/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilangan1;

import java.util.Scanner;

/**
 *
 * @author MOKLET-02
 */
public class Penilangan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int harga, bayar, kembali, kurang;
        
        System.out.println("\n Penilangan Tata Tertib \n");
        
        System.out.println("Pilihan Pelanggaran : ");
        String[] penilangan = {" ", "Tidak Memakai Masker", "Tidak Membawa SIM", "Tidak Membawa STNK"};
        for (int i=1; i <penilangan.length; i++){
            System.out.println(i+" "+penilangan[i]);
        
        }System.out.print("Pelanggaran yang telah dilakukan:");
        int pilihanpelanggaran = input.nextInt();
        
      //pilihan
      switch (pilihanpelanggaran){
          case 1:
              System.out.println("Anda dikenakan denda sebesar 150.000");
              System.out.print("Pembayaran sebesar :");
              bayar = input.nextInt();
              harga = 200000;
              
              if (bayar==harga){
                  System.out.println("Uang Anda sudah pas, Jangan lupa memakai maskernya lagi!");
                  
             }else if (bayar>harga){
                 kembali = bayar-harga;
                 System.out.println("Uang Anda kembali sebesar"+kembali);
                 System.out.println("Jangan lupa memakai masker lagi dan tetap patuhi protokol yang ada !");
                 
             }else if (bayar<harga){
              kurang = harga-bayar;
              System.out.println("Uang anda kurang"+kurang);
              System.out.println("Mohon Maaf anda tidak boleh pergi !");
                     
             }break;
           case 2:
              System.out.println("Anda dikenakan denda sebesar 250.000");
              System.out.print("Pembayaran sebesar :");
              bayar = input.nextInt();
              harga = 250000;
              
              if (bayar==harga){
                  System.out.println("Uang Anda sudah pas, Jangan lupa membawa SIM lagi !");
                  
             }else if (bayar>harga){
                 kembali = bayar-harga;
                 System.out.println("Uang Anda kembali sebesar"+kembali);
                 System.out.println("Jangan lupa membawa SIM lagi !");
                 
             }else if (bayar<harga){
              kurang = harga-bayar;
              System.out.println("Uang anda kurang"+kurang);
              System.out.println("Mohon Maaf anda tidak boleh pergi !");
                     
             }break; 
           case 3 :
              System.out.println("Anda dikenakan denda sebesar 700.000");
              System.out.print("Pembayaran sebesar :");
              bayar = input.nextInt();
              harga = 500000;
              
              if (bayar==harga){
                  System.out.println("Uang Anda sudah pas, Jangan lupa membawa STNK !");
                  
             }else if (bayar>harga){
                 kembali = bayar-harga;
                 System.out.println("Uang Anda kembali sebesar"+kembali);
                 System.out.println("Jangan lupa membawa STNK !");
                 
             }else if (bayar<harga){
              kurang = harga-bayar;
              System.out.println("Uang anda kurang"+kurang);
              System.out.println("Mohon Maaf anda tidak boleh pergi !");
                     
             }break;
           default :
               System.out.println("Anda lengkap memakai masker, membawa SIM dan membawa STNK");
           break;
    }
    }
    
}
