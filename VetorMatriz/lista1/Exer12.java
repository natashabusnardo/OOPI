package lista1;

import java.util.Scanner;

/**
*
* @author natasha.busnardo
*/
public class Exer12 {
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method st
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        
		System.out.print("Insira a entrada: ");
        String entradas  = entrada.nextLine();
		
        String separado[] = entradas.split(";");
        
        for (int i = 0; i < separado.length; i++) {
			System.out.println(separado[i]);
		}
       
		
        
	    
	}
}
