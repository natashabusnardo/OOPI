package lista01;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Insira o peso da pesca(KG): ");
        float peso = entrada.nextFloat();
        entrada.close();
        
        
        if (peso>50) {
        	float excesso = peso-50;
        	System.out.println("O valor de multa a ser pago é: "+excesso*4);
        }
	    else 
	    	System.out.println("Sem excesso de peso.");
        
      
        
	}
}
