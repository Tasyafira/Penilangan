/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilangan;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class Penilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("<<< PENILANGAN >>>");
       System.out.println("Pelanggaran : ");
       String [] tilang = {" ", "Tidak Pakai Masker", "Tidak Membawa SIM", "Tidak Membawa STNK"};
       for (int i = 1; i < tilang.length; i++)  
            System.out.println(i+"."+tilang[i]);
       System.out.println("\n");
       
       System.out.print("Pelanggaran Yang Dilakukan : ");
       int nomor = input.nextInt();
       switch(nomor){
            case 1 :
                System.out.println("Anda telah melanggar protokol kesehatan ");
                System.out.println("Anda akan dikenakan denda sebesar Rp 250.000,00 ");
                System.out.print("Masukkan uang anda : ");
                int uang1 = input.nextInt();
                int denda1 = 250000;
                if(uang1 == denda1){
                    System.out.println("\n");
                    System.out.println("Terima Kasih Telah Melakukan Pembayaran");
                    System.out.println("Jaga Kesehatan dan Patuhi Protokol Kesehatan ");
                }else{
                    int kembalian1 = uang1 - denda1;
                    System.out.print("Kembalian : "+kembalian1);
                    System.out.println("\n");
                    System.out.println("Terima Kasih Telah Melakukan Pembayaran");
                    System.out.println("Jaga Kesehatan dan Patuhi Protokol Kesehatan ");   
            } 
                break;
            case 2 :
                System.out.println("Anda telah melanggar peraturan lalu lintas ");
                System.out.println("Anda akan dikenakan denda sebesar Rp 750.000,00 ");
                System.out.print("Masukkan uang anda : ");
                int uang2 = input.nextInt();
                int denda2 = 750000;
                if(uang2 == denda2){
                    System.out.println("\n");
                    System.out.println("Terima Kasih Telah Melakukan Pembayaran");
                    System.out.println("Jangan Lupa Selalu Membawa SIM dan Patuhi Aturan Lalu Lintas ");
                }else{
                    int kembalian2 = uang2 - denda2;
                    System.out.print("Kembalian : "+kembalian2);
                    System.out.println("\n");
                    System.out.println("Terima Kasih Telah Melakukan Pembayaran");
                    System.out.println("Jangan Lupa Selalu Membawa SIM dan Patuhi Aturan Lalu Lintas ");
                }
                break;
            case 3 :
                System.out.println("Anda telah melanggar peraturan lalu lintas ");
                System.out.println("Anda akan dikenakan denda sebesar Rp 750.000,00 ");
                System.out.print("Masukkan uang anda : ");
                int uang3 = input.nextInt();
                int denda3 = 750000;
                if(uang3 == denda3){
                    System.out.println("\n");
                    System.out.println("Terima Kasih Telah Melakukan Pembayaran");
                    System.out.println("Jangan Lupa Selalu Membawa STNK dan Patuhi Aturan Lalu Lintas ");
                }else if(uang3 > denda3){
                    int kembalian3 = uang3 - denda3;
                    System.out.print("Kembalian : "+kembalian3);
                    System.out.println("\n");
                    System.out.println("Terima Kasih Telah Melakukan Pembayaran");
                    System.out.println("Jangan Lupa Selalu Membawa STNK dan Patuhi Aturan Lalu Lintas ");
                }
                break;
            default:
                System.out.println("EROR");
                break;
        }
  
    }
    
}
