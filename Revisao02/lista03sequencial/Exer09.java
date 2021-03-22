package lista03;

import java.util.Scanner;

public class Exer09 {
	public static void main(String[] args) {
        
      
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escreva o número para calcular sua tabuada.");   
        int numero = entrada.nextInt();
        
        entrada.close();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " +numero*i);
        }
	}
}
