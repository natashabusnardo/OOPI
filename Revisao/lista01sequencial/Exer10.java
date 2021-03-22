package lista01;
import java.util.Scanner;
public class Exer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Insira o primeiro número inteiro: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Insira o segundo número inteiro: ");
        int num2 = entrada.nextInt();
        
        System.out.print("Insira o número real: ");
        float num3 = entrada.nextFloat();
        
        entrada.close();
        
        float a = (num1*2)*(num2/2);
        float b = (num1*3)+num3;
        float c = (num3*num3*num3);
        
        System.out.println("O produto do dobro do primeiro com metade do segundo: "+a);
        System.out.println("A soma do triplo do primeiro com o terceiro: "+b);
        System.out.println("O terceiro elevado ao cubo: "+c);
	}

}
