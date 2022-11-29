/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts3;

/**
 *
 * @author andreas
 */
public class Mahasiswa  {
    String nama ;
    String NIM ;
    String Jurusan ;

    public Mahasiswa() {
    }
   

    public Mahasiswa(String nama, String NIM, String Jurusan) {
        this.nama = nama;
        this.NIM = NIM;
        this.Jurusan = Jurusan;
    }
    
    public void TampilData (){
        
        System.out.println("Nama Mahasiswa :"+nama );
        System.out.println("NIM :"+NIM);
        System.out.println(" Jurusan :"+Jurusan);
        
    }
    
  
    
}
