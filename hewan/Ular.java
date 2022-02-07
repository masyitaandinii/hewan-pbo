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
public class Ular {
    int kaki = 0;
    String lahir = "bertelur";
    String makan = "karnivora";
    
    void Awal(){
        System.out.println("5. Ular");
    }
    
    void Berkembangbiak(){
        System.out.println("- Ular berkembangbiak dengan cara "+lahir);
    }    
    void Fisik(){
        System.out.println("- Ular memiliki ciri fisik yaitu berkaki "+kaki +" atau tidak memiliki kaki");
    }
    void Makanan(){
        System.out.println("- Ular merupakan hewan pemakan daging yang disebut dengan "+makan);
    }    
    
}
