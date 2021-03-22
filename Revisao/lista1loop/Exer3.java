package lista1;


/**
*
* @author natasha.busnardo
*/
import java.util.Scanner;

public class Exer3 {
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int TAM = 0;
		int soma = 0, maior = 0, menor = 0;
		float  media=0;
		String acima = "", abaixo = "", par = "", impar = "";
		
		System.out.println("Insira o números de elementos do vetor:");
		TAM = entrada.nextInt();
		
		int vet[] = new int[TAM];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = entrada.nextInt();
			soma = soma + vet[i];
			
			if(i == 0) {
        		maior = vet[i];
        		menor = vet[i];
        		}
        		else if(vet[i]>maior) {
        			maior = vet[i];
        		}
        		else if(vet[i]<menor) {
        			menor = vet[i];
        		}
			if(vet[i] % 2 == 0) {
				par = par+vet[i]+"|";
			}	
			else
				impar = impar+vet[i]+"|";

		}
		media = soma / TAM;
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] > media) 
				acima = acima+vet[i]+"|";
			else if(vet[i] < media)
				abaixo = abaixo+vet[i]+"|";
		}
		
		System.out.println("Acima: "+acima);
		
		System.out.println("Abaixo: "+abaixo);
		
		System.out.println("Ímpares:" +impar);
		
		System.out.println("Pares: " +par);
		
		System.out.println("Média: "+soma/TAM);
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
		
		
	}

}
