/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Tester {
    
    /**
     * @param args
     */
      public static void main(String[] args){
          Mahasiswa mhs = new Mahasiswa();
          mhs.nim = "10118063";
          mhs.nama = "Naufal Asha";
          mhs.perkenalanDiri();
          
          mhs.nim = "10110270";
          mhs.nama = "Indra Tiola";
          mhs.perkenalanDiri();
          
          mhs.nim = "10110271";
          mhs.nama = "Robi Tanzil Ganefi";
          mhs.perkenalanDiri();
          
          mhs.nim = "10110269";
          mhs.nama = "Muhammad Nur Awaludin";
          mhs.perkenalanDiri();
      }
}
