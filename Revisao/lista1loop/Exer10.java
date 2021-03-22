package lista1;


/**
*
* @author natasha.busnardo
*/
import java.util.Scanner;

public class Exer10 {
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        



		
		System.out.println("Informe uma mensagem: ");
		String mensagem = entrada.nextLine();
		
		char [] letras = mensagem.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}

	}



}
