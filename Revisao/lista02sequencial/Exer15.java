package lista02;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
        
		System.out.print("Insira o pre�o de custo: ");
        float preco  = entrada.nextInt();
		
		System.out.print("Insira o c�digo de origem: ");
        int codigo  = entrada.nextInt();
        
        entrada.close();
        
        String origem=" ";
        

        if (codigo == 1) 
        	 origem = "Sul.";  
        
	    else if(codigo == 2) 
	    	origem = "Norte.";
        
	    else if(codigo == 3) 
	    	origem = "Leste.";
        
	    else if(codigo == 4) 
	    	origem = "Oeste.";
        
	    else if((codigo == 5)||(codigo == 6)) 
	    	origem = "Nordeste.";
        
	    else if((codigo == 7)||(codigo == 8)) 
	    	origem = "Centro-Oeste.";

	    else 
	    	origem = "Importado.";
	    
        System.out.println("Pre�o de custo: "+ preco);
        System.out.println("Origem: "+ origem);
	}
}
