package lista1;


/**
*
* @author natasha.busnardo
*/
import java.util.Scanner;


class Pessoas{
	int idade;
	float altura;
}

public class Exer13 {
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        
        float menor = 0, maior = 0, mvelho = 0, mnovo = 0;
        
        Pessoas pessoa[]= new Pessoas[5];
        
           
			for (int i = 0; i < 5; i++) {
				pessoa[i]=new Pessoas();
				System.out.print("Insira a idade: ");
				pessoa[i].idade = entrada.nextInt();
	        	
	        	System.out.print("Insira a altura: ");
	        	pessoa[i].altura = entrada.nextFloat();
	        	
				if(i == 1) {
					maior = pessoa[i].altura;
					menor = pessoa[i].altura;
					mvelho = pessoa[i].idade;
					mnovo = pessoa[i].idade;
				}	
				else if(pessoa[i].altura > maior) {
					maior = pessoa[i].altura;
					
				}
				else if(pessoa[i].altura < menor) {
					menor = pessoa[i].altura;
				}
				else if(pessoa[i].idade < mnovo) {
					mnovo = pessoa[i].idade;
					
				}
				else if(pessoa[i].idade > mvelho) {
					mvelho = pessoa[i].idade;
				}
			}
        	
			for (int i = (pessoa.length)-1; i >= 0; i--) {
				System.out.println("Idade: "+pessoa[i].idade);
	        	
	        	System.out.println("Altura: "+pessoa[i].altura);
			}
        	
					
        System.out.println("Mais alto: "+maior);
        System.out.println("Mais baixo: "+menor);
        System.out.println("Mais velho: "+mvelho);
        System.out.println("Mais novo: "+mnovo);
            
	}
}
