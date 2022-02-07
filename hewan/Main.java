/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 * @author MASTER 10
 */
public class Main {

    
    public static void main(String[] args) {
        
        System.out.println("Program kali ini adalah program untuk menjelaskan ciri umum hewan. "
                         + "Ciri ciri hewan sangat beragam dan panjang sekali apabila dijelaskan satu per satu, jadi ini hanya menjelaskan ciri ciri beberapa jenis hewan secara umum");
        
        System.out.println("\t");
        
        Ayam kampung = new Ayam();
        Ikan hias = new Ikan();
        Burung peliharaan = new Burung();
        Sapi kurban = new Sapi();
        Ular sawah = new Ular();
           
               
        kampung.Awal();
        kampung.Berkembangbiak();
        kampung.Fisik();
        kampung.Makanan();
        
        System.out.println("\t");
        
        hias.Awal();
        hias.Berkembangbiak();
        hias.Fisik();
        hias.Makanan();
        
        System.out.println("\t");
        
        peliharaan.Awal();
        peliharaan.Berkembangbiak();
        peliharaan.Fisik();
        peliharaan.Makanan();
        
        System.out.println("\t");
        
        kurban.Awal();
        kurban.Berkembangbiak();
        kurban.Fisik();
        kurban.Makanan();
        
        System.out.println("\t");
        
        sawah.Awal();
        sawah.Berkembangbiak();
        sawah.Fisik();
        sawah.Makanan();
        
        
        
        
        
        
    }
    
}
