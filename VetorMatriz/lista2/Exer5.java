package lista2;

import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
		        
		        @SuppressWarnings("resource")
		        Scanner entrada = new Scanner(System.in);
		        
		        int  cont = 0;
		        
		        
		        
		        System.out.println("Insira o n�mero de cartelas:");
		        int qtd = entrada.nextInt();
		                
		        int matriz[][] = new int[qtd][6];  
		        
		            for (int i = 0; i < qtd; i++) {
		               
		                for (int j = 0; j < 6; j++) { //calculo da cartela
		                	
		                    matriz[i][j] = (int) (Math.random() * 60);
		                    

		                   for (int k = 0; k < cont; k++) {
		                	 if((matriz[i][j] == matriz[i][k]) && k != j){
		                		 matriz[i][j] = (int) (Math.random() * 60);
		                     }else{
		                    	 matriz[i][j] = matriz[i][j];
		                     }
		                   }		           
		                }
		                  }	                
			                
		           for (int i = 0; i < qtd; i++) {
		               System.out.println("\nCartela "+(i+1));
		               System.out.println("----------------");
		                for (int j = 0; j < 6; j++) {
		                   System.out.print(matriz[i][j]+"|");
		                } 
		                System.out.println("\n"); 
		           }	          
	}
}
