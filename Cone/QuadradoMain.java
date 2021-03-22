/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author natasha.busnardo
 */
public class QuadradoMain {
    
    public static void main(String[] args){
        Quadrado q = new Quadrado();
        
        q.setLado(10);
        
        System.out.println(q.getLado());
        System.out.println(q.area());
    }
        
}
