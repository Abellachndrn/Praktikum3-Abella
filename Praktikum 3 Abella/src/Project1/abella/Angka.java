/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1.abella;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author asus
 */
import java.util.Random;
import java.util.Scanner;
public class Angka {
    
    Random acak = new Random();
    Scanner input = new Scanner (System.in);
    int bil = 100;
    int int_rndm = acak.nextInt(bil);
    int entri;
    void mula(){
        System.out.println("Hai..Nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak yaa!!!");
    }
    void tebak(){
        while (this.entri !=this.int_rndm){
            System.out.print("Masukkan Tebakan: ");
            this.entri = input.nextInt();
            if(this.entri == this.int_rndm){
                System.out.println("Yeee....Bilangan tebakan Anda BENAR!");
            }
            else if(this.entri>this.int_rndm){
                System.out.println("Hehehe....Bilangan tebakan Anda terlalu besar");
            }
            else if(this.entri<this.int_rndm){
                System.out.println("Hehehe....Bilangan tebakan Anda terlalu kecil");
            }
            
        }
    }
}
