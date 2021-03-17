/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

/**
 *
 * @author MOKLET-1
 */
public class siswa {

 // mendifinisikan atribut
 String nama;
 int nilai;
 
 
 //method cetak nilai
 void siswa(){
 System.out.println("Nilai Produktif RPL 5 "+nama+" adalah =" +nilai);
 }
 //method pengecekan
 public boolean lulus(){
 return nilai>=75;
 }
 public boolean tidaklulus(){
 return nilai<74;
 }

    
}

   

 
    

