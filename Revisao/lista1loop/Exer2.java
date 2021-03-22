package lista1;


/**
*
* @author natasha.busnardo
*/
import java.util.Scanner;

public class Exer2 {
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;

		int vet[] = new int[TAM];
		
		for (int i = 0; i < vet.length; i++) { 
			vet[i] = entrada.nextInt();
		}
		
		for (int i = (vet.length)-1; i >= 0; i--) { 
			System.out.println(vet[i]);
		}
		
	}

}
