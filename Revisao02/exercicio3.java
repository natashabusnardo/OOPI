package lista1;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int nota1 = 0;
		int nota5 = 0;
		int nota10 = 0;
		int nota50 = 0;
		int nota100 = 0;
		

		System.out.println("Informe o valor do saque: ");
		int saque = entrada.nextInt();
		
		if(saque > 1 && saque < 600) {
			nota100 = saque/100;
			saque = saque - (nota100*100);
			nota50 = saque/50;
			saque = saque - (nota50*50);
			nota10 = saque/10;
			saque = saque - (nota10*10);
			nota5 = saque/5;
			saque = saque - (nota5*5);
			nota1 = saque;
			
			System.out.println("Notas de 100: "+nota100);
			System.out.println("Notas de 50: "+nota50);
			System.out.println("Notas de 10: "+nota10);
			System.out.println("Notas de 5: "+nota5);
			System.out.println("Notas de 1: "+nota1);
		}
		else {
			System.out.println("Valor fora do intervalo.");
		}
	}
}
