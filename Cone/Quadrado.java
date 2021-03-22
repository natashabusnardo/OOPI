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
public class Quadrado {
    private int lado;
    private String cor;

    public String getCor() {       
            return cor;
    }

    public void setCor(String cor) {
        if(cor.length() > 2)
            this.cor = cor;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        if(lado > 0)
        this.lado = lado;
    }
    
    public float area(){
        return lado * lado;
    }
}
