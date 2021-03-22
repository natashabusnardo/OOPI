/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author natasha
 */
public class Exer2 {
      /**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        
        @SuppressWarnings("resource")
	Scanner entrada = new Scanner(System.in);
        
        float menor = 0, maior = 0;
        double mediam = 0;
        
        float somap[] = new float[5];
        float somam[] = new float[5];
                
        float matriz[][] = new float[5][5];   
        
            for (int i = 0; i < matriz.length; i++) {
                System.out.println("Mercado "+(i+1));
                for (int j = 0; j < matriz.length; j++) {
                    System.out.println("Produto "+(j+1)+": ");
                    matriz[i][j] = entrada.nextInt();
                    
                    somap[j] += matriz[i][j];
                    somam[i] += matriz[i][j];
                    
                }
                if((i == 1)){
                    maior = somam[i];
                    menor = somam[i];
                }
                else if(somam[i] > maior){
                    maior = somam[i];
                }
                else if(somam[i] < menor){
                    menor = somam[i];
                }
                
            }
           
           System.out.println("Soma de preço por SuperMercado: ");  
           
           for (int i = 0; i < 5; i++) {      
                System.out.print("\nSuperMercado "+(i+1)+": "+somam[i]);
            }
           
           System.out.println("Média de preço por produto: ");
           for (int i = 0; i < 5; i++) {      
                System.out.print("\nProduto "+(i+1)+": "+(somap[i]/5));
            }
            
           System.out.println("Valor total SuperMercado mais caro: "+maior);
           System.out.println("Valor total SuperMercado mais barato: "+menor);
           
            for (int i = 0; i < 5; i++) {
                System.out.println("Preços do SuperMercado "+(i+1));
                for (int j = 0; j < 5; j++) {
                   System.out.println("Produto "+(j+1)+":"+matriz[i][j]);
                }
            }
	}
}
