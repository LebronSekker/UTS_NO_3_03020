/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts3;
import java.util.Scanner;
/**
 *
 * @author andreas
 */
public class Asprak extends Mahasiswa implements Pendaftaran { 
    
    Scanner keyboard = new Scanner(System.in);
    
    private String mkAsisten ;
    private int JumlahPertemuan ;
    Mahasiswa asprak  ;
    int TotalPendapatan ;

    public Asprak(String nama, String NIM, String Jurusan) {
        super(nama, NIM, Jurusan);
    }

    
    
    public Asprak(String mkAsisten, int JumlahPertemuan, String nama, String NIM, String Jurusan) {
        super(nama, NIM, Jurusan);
        this.mkAsisten = mkAsisten;
        this.JumlahPertemuan = JumlahPertemuan;
    }
    
    
    
    public void TotalPendapatan (){
         TotalPendapatan = JumlahPertemuan * 50000;
        
    }

    public void setAsprak () {
          System.out.println("matakuliah yang diajarkan :");
               mkAsisten = keyboard.nextLine();
          System.out.println("jumlah pertemuan :");
          JumlahPertemuan = keyboard.nextInt();
    }
    
    
    public void tampil () {
        System.out.println("Nama Mahasiswa  :" +nama);
        System.out.println("NIM Mahasiswa  :" +NIM);
        System.out.println("Jurusan Mahasiswa :" +Jurusan);
        System.out.println("matakuliah yang diajarkan :" +mkAsisten);    
        System.out.println("jumlah pertemuan :" +JumlahPertemuan);
        System.out.println("Gaji Total :" +TotalPendapatan);       
       
    }

   
    
    
}
