package lista1;


/**
*
* @author natasha.busnardo
*/
import java.util.Scanner;

public class Exer8 {
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int soma = 0, prod = 1;

		int vet[] = new int[TAM];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = entrada.nextInt();
			soma = soma + vet[i];
			prod = prod * vet[i];
		}
		System.out.println("Soma: "+soma);
		System.out.println("Produto: "+prod);
		

	}

}
