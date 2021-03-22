package lista03;

import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Insira a base ");
        int base = entrada.nextInt();
        
        System.out.print("Insira o expoente ");
        int expo = entrada.nextInt();
        
        entrada.close();
        

        for (int i = 1; i < expo; i++) {
			base = base*base;
		}
        
        System.out.println("O resultado da operação é:"+base);
            
	}
}
