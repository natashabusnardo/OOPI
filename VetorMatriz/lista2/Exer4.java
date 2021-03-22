/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author natasha.busnardo
 */
public class Exer4 {
	  /**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
		        
		        @SuppressWarnings("resource")
		        Scanner entrada = new Scanner(System.in);
		        
		        float  maiorm = 0, menorm = 0;
		        
		        
		        
		        System.out.println("Insira o número de alunos:");
		        int qtd = entrada.nextInt();
		                
		        float matriz[][] = new float[qtd][5];  
		        float somaa[] = new float[qtd];
		        
		            for (int i = 0; i < qtd; i++) {
		                System.out.println("Informe os saltos do aluno "+(i+1));
		               
		                for (int j = 0; j < 5; j++) {
		                    System.out.println("Salto "+(j+1)+": ");
		                    matriz[i][j] = entrada.nextFloat();
		                    
		                    somaa[i] += matriz[i][j];
		                    
		                }
		                if((i == 1)){
		                    maiorm = somaa[i]/5;
		                    menorm = somaa[i]/5;

		                }
		                else if((somaa[i]/5) > maiorm)
		                    maiorm = (somaa[i]/5);

		                
		                else if((somaa[i]/5) < menorm)
		                    menorm = (somaa[i]/5);		               
		                
		            }
		            
		           for (int i = 0; i < qtd; i++) {
		               System.out.println("Aluno "+(i+1));
		                for (int j = 0; j < 5; j++) {
		                   System.out.println("Salto "+(j+1)+": "+matriz[i][j]);
		                }
		               System.out.println("Média: "+somaa[i]/5);
		     
		                   
		           }

		           System.out.println("A maior média de saltos foi : "+maiorm);
		           System.out.println("A menor média de saltos foi : "+menorm);
		          

	}
}
