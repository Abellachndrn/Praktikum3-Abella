/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2.abella;

/**
 *
 * @author asus
 */

import java.util.Random;
import java.util.Scanner;
public class Angka2 {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int bil = 100;
    int int_rndm = rand.nextInt(bil);
    int entri;
    int nilai = 100;
    int tebakan = 1;
    void mula(){
        System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
    }
    void tebak (){
        while (this.entri != this.int_rndm){
            System.out.print("Masukan Tebakan Anda : ");
            this.entri = input.nextInt();
            this.tebakan = this.tebakan + 1;
            this.nilai = this.nilai - 2;
            if(this.entri == this.int_rndm){
                System.out.println("Yeeee… Bilangan tebakan anda BENAR!");
                this.nilai = this.nilai + 2;
                if(this.tebakan <= 5){
                    this.nilai = this.nilai + 50;
            }
                System.out.println("Score Anda: " + this.nilai);
                break;
            }
            else if(this.entri < this.int_rndm){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            }
            else if(this.entri > this.int_rndm){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            }
        }
    }
}