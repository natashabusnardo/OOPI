package lista1;


/**
*
* @author natasha.busnardo
*/
import java.util.Scanner;

public class Exer4 {
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int TAM = 4,soma = 0;
		float  media=0;

		int vet[] = new int[TAM];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Informe a nota"+(i+1));
			vet[i] = entrada.nextInt();
			soma = soma+vet[i];
		}
		media = soma/TAM;
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Nota "+(i+1)+ ": "+vet[i]);
		}
		System.out.println("Média: "+media);		
		
	}

}
