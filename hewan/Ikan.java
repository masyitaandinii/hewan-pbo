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
public class Ikan {
    int kaki = 0;
    String lahir = "bertelur";
    String makan = "omnivora";
    
    void Awal(){
        System.out.println("2. Ikan");
    }
    
    void Berkembangbiak(){
        System.out.println("- Ikan berkembangbiak dengan cara "+lahir);
    }    
    void Fisik(){
        System.out.println("- Ikan memiliki ciri fisik yaitu berkaki "+kaki + " atau tidak memiliki kaki");
    }
    void Makanan(){
        System.out.println("- Ikan merupakan hewan pemakan segalanya yang disebut dengan "+makan);
    }
    
}
