package lista03;
import java.util.Scanner;
public class Exer01 {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digita uma nota: ");
		int nota = entrada.nextInt();
		
		
		while ((nota<0)||(nota>10)) {
			System.out.println("Insira uma nota válida: ");
			nota = entrada.nextInt();
		}
		entrada.close();
		
	}
}
