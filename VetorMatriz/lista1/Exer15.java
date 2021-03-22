package lista1;


/**
*
* @author natasha.busnardo
*/
import java.util.Scanner;


public class Exer15{
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        
        @SuppressWarnings("resource")
	Scanner entrada = new Scanner(System.in);
        
        float soma = 0, media = 0;  
        int TAM = 5, qtd = 0;
        int idade[] = new int[30];
        float altura[] = new float[30];
        
           
            for (int i = 0; i < TAM; i++) {
		System.out.print("Insira a idade: ");
		idade[i] = entrada.nextInt();
	        	
	        System.out.print("Insira a altura: ");
	        altura[i] = entrada.nextFloat();
                
                soma += altura[i];
		
            }
            media = soma/TAM;
            for (int i = 0; i < TAM; i++) {
                if(idade[i]>13){
                    if(altura[i] < media)
                     qtd++;   
                }
            }
        	
					
        System.out.println("Alunos com mais de 13 anos com altura menor que a média: "+qtd);
            
	}
}
