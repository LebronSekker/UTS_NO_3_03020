/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts3;

/**
 *
 * @author andreas
 */
public class Uts3 {

    public static void main(String[] args) {
        
        System.out.println("---ASISTEM PRAKTIKUM");
        Asprak e = new Asprak ("Dani" , "21103020", "Sistem Informasi") ;
        e.setAsprak();
        e.TotalPendapatan();
        e.tampil();
        
        System.out.println("");
        System.out.println("S");
        System.out.println("----Student Staff");
        
        StudentStaff f = new StudentStaff ("Deden","1103020","Tehnik Informatika");
        f.setStudenet();
        f.TotalPendapatan();
        f.tampil();
       
       
    }
}
