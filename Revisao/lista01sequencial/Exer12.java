package lista01;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        
		Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Insira o seu sexo(M/F): ");
        String sexo = entrada.nextLine();
        
        System.out.print("Insira a sua altura: ");
        float altura = entrada.nextFloat();
        
        entrada.close();
        
        double pesoideal;
        
        if (sexo=="M") 
        	 pesoideal = (72.7*altura)-58;     
	    else 
	    	 pesoideal = (61.1*altura)-44.7;
	    
        
        System.out.println("O seu peso ideal é: "+pesoideal);
        
	}
}
