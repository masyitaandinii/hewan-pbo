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
public class Ayam {
    int kaki = 2;
    String lahir = "bertelur";
    String makan = "omnivora";
    
    void Awal(){
        System.out.println("1. Ayam");
    }
    
    void Berkembangbiak(){
        System.out.println("- Ayam berkembangbiak dengan cara "+lahir);
    }    
    void Fisik(){
        System.out.println("- Ayam memiliki ciri fisik yaitu berkaki "+kaki);
    }
    void Makanan(){
        System.out.println("- Ayam adalah hewan pemakan segalanya yang disebut dengan "+makan);
    }
    
}
