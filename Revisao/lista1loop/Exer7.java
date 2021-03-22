package lista1;


/**
*
* @author natasha.busnardo
*/
import java.util.Scanner;

public class Exer7 {
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int TAM = 10, cont = 0;
		float soma = 0;
		
		float vet[] = new float[TAM];

		for (int i = 0; i < vet.length; i++) {
			
			System.out.println("Informe as notas do aluno"+(i+1)+":");
			for (int j = 0; j < 4; j++) {
				System.out.println("Nota "+(i+1)+":");
				Float num = entrada.nextFloat();
				soma = soma + num;
			}
			vet[i] = soma/4;
	
			if(vet[i]>=7)
				cont++;
		}
	

		System.out.println("Número de alunos com média maior ou igual a 7: "+cont);

		
	}

}
