package lista01;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Insira a sua altura: ");
        float altura = entrada.nextFloat();
        
        entrada.close();
        
        double pesoideal = (72.7*altura)-58;
        
        System.out.println("O seu peso ideal é: "+pesoideal);
        
	}
}
