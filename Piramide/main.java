import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piramide pi = new Piramide();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor de ab: ");
		pi.setAb(entrada.nextFloat());
		
		System.out.println("Informe o valor da altura(h): ");
		pi.setH(entrada.nextFloat());
		
		pi.setA1();
        pi.setB();
        pi.setAreaTriangulo();
        pi.setAreaBase();
        pi.setAreaTotal();
        
        int tinta = 0;
        
        do {
        	System.out.println("Informe o tipo da tinta(1,2 ou 3): ");
        	tinta = entrada.nextInt();
        	if((tinta<=0)||(tinta>3))
        		System.out.println("Valor inválido. Insira novamente");
        }while((tinta<=0)||(tinta>3));
        
        pi.setTinta(tinta);
        
        pi.setValor();
        entrada.close();
        
        
        pi.setLitros();
        pi.setLatas();
        pi.setPreco();
        pi.setVolume();
        
        System.out.println("ab: "+pi.getAb());
        System.out.println("Altura: "+pi.getH());
        System.out.println("a1: "+pi.getA1());
        System.out.println("Área do Triângulo: "+pi.getAreaTriangulo());
        System.out.println("Area da Base: "+pi.getAreaBase());
        System.out.println("Area Total: "+pi.getAreaTotal());
        System.out.println("Tipo de Tinta: "+ pi.getTinta());
        System.out.println("Litros "+pi.getLitros());
        System.out.println("Latas: "+pi.getLatas());
        System.out.println("Preço: "+pi.getPreco());
        System.out.print("Volume: "+pi.getVolume());
        }
		
		
	}


