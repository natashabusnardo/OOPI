package lista1;

import java.util.Scanner;

/**
*
* @author natasha.busnardo
*/
public class Exer11 {
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method st
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        
		System.out.print("Insira a data no formato dd/mm/aaaa: ");
        String data  = entrada.nextLine();
		
        String validar[] = data.split("/");
        
        for (int i = 0; i < validar.length; i++) {
			System.out.println(validar[i]);
		}
       
		
        
	    
	}
}
