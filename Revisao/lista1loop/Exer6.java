package lista1;


/**
*
* @author natasha.busnardo
*/
import java.util.Scanner;

public class Exer6 {
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int TAM = 20;
		
		int vet[] = new int[TAM];
		int par[] =  new int[TAM];
		int impar[] =  new int[TAM];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = entrada.nextInt();
	
			
			if(vet[i] % 2 == 0) 
				par[i] = vet[i];
				
			else
				impar[i] = vet[i];

		}
	

		for (int i = 0; i < vet.length; i++) { 
			System.out.println("Posição "+(i+1)+":"+vet[i]);
		}
		
		System.out.println("Ímpares:");
		for (int i = 0; i < impar.length; i++) { 
			if(par[i] != 0)
			System.out.println(impar[i]);
		}
		
		System.out.println("Pares: ");
		for (int i = 0; i < par.length; i++) {
			if(par[i] != 0)
			System.out.println(par[i]);
		}

		
	}

}
