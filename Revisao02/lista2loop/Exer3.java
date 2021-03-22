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
public class Exer3 {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        
        @SuppressWarnings("resource")
	Scanner entrada = new Scanner(System.in);
        
        float menor = 0, maior = 0, maiorm = 0, menorm = 0, somam = 0;
        String nmenor = "", nmaior = "", nmaiorm = "", nmenorm = "", abaixo = "";

        
        
        
        System.out.println("Insira o número de alunos:");
        int qtd = entrada.nextInt();
                
        float matriz[][] = new float[qtd][2];  
        float somaa[] = new float[qtd];
        String aluno[] = new String[qtd];
        
            for (int i = 0; i < qtd; i++) {
                System.out.println("Informeo nome do aluno "+(i+1));
                aluno[i] = entrada.nextLine();
                for (int j = 0; j < 2; j++) {
                    System.out.println("Nota "+(j+1)+": ");
                    matriz[i][j] = entrada.nextFloat();
                    
                    if((i == 1)){
                        maior = matriz[i][j];
                        menor = matriz[i][j];
                        nmaior = aluno[i];
                        nmenor = aluno[i];
                    }
                    else if(somaa[i] > maior){
                        maior = matriz[i][j];
                        nmaior = aluno[i];
                    }
                    else if(somaa[i] < menor){
                        menor = matriz[i][j];
                        nmenor = aluno[i];
                }
                    somaa[i] += matriz[i][j];
                    
                }
                somam += somaa[i]/2;
                if((i == 1)){
                    maiorm = somaa[i]/2;
                    menorm = somaa[i]/2;
                    nmaiorm = aluno[i];
                    nmenorm = aluno[i];
                }
                else if((somaa[i]/2) > maiorm){
                    maiorm = (somaa[i]/2);
                    nmaiorm = aluno[i];
                }
                else if((somaa[i]/2) < menor){
                    menorm = (somaa[i]/2);
                    nmenorm = aluno[i];
                }
                
               
                
            }
            
           for (int i = 0; i < qtd; i++) {
               System.out.println("Aluno "+aluno[i]);
                for (int j = 0; j < 2; j++) {
                   System.out.println("Nota "+(j+1)+":"+matriz[i][j]);
                }
               System.out.println("Média: "+somaa[i]/2);
               
               if((somaa[i]/2) < (somam/qtd))
                   abaixo += aluno[i]+", ";
                   
           }
           System.out.println("A maior nota foi do "+nmaior+" com: "+maior);
           System.out.println("A menor nota foi do "+nmenor+" com: "+menor);
           System.out.println("A maior média foi do "+nmaiorm+" com: "+maiorm);
           System.out.println("A maior média foi do "+nmenorm+" com: "+menorm);
           System.out.println("Alunos com média abaixo da média geral:  "+abaixo);

           
   }
}
