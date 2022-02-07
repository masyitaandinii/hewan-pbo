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
public class Burung {
    int kaki = 2;
    String lahir = "bertelur";
    String makan = "herbivora";
    
    void Awal(){
        System.out.println("3. Burung");
    }
    
    void Berkembangbiak(){
        System.out.println("- Burung berkembangbiak dengan cara "+lahir);
    }    
    void Fisik(){
        System.out.println("- Burung memiliki ciri fisik yaitu berkaki "+kaki);
    }
    void Makanan(){
        System.out.println("- Burung merupakan hewan pemakan biji bijian yang disebut dengan "+makan);
    }    
}
