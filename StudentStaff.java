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
public class StudentStaff extends Mahasiswa implements Pendaftaran { 
    Scanner keyboard = new Scanner(System.in);
    
    int unKerja ;
    int JamKerja ;
    Mahasiswa Student ;
    int Total ;

    public StudentStaff() {
    }

    public StudentStaff(String nama, String NIM, String Jurusan) {
        super(nama, NIM, Jurusan);
    }
    
    public StudentStaff(int unKerja, int JamKerja, String nama, String NIM, String Jurusan) {
        super(nama, NIM, Jurusan);
        this.unKerja = unKerja;
        this.JamKerja = JamKerja;
    }
     public void setStudenet () {
         System.out.println("unit kerja  :");
        unKerja = keyboard.nextInt();
        System.out.println("JumlaH jam kerja :");
        JamKerja =  keyboard.nextInt();
     }
    
    public void TotalPendapatan () {
        Total = JamKerja * 30000 ;
        
    }
    
    public void tampil () {
        System.out.println("Nama Mahasiswa :"+nama);
        System.out.println("NIM Mahasiswa :"+NIM);
        System.out.println("Jurusan Mahasiswa : "+Jurusan );
        System.out.println("Unit Kerja : " +unKerja);
        System.out.println("Jumlah Jam Kerja :"+JamKerja);
        System.out.println("Total Gaji :"+Total);
       
    
    }
}
