
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cone cone = new Cone(3.5, 9, 2);

		System.out.println("Geratriz: " + cone.g());
		System.out.println("�rea fundo: " + cone.areaFundo());
		System.out.println("�rea Lateral Cone: "+cone.areaLateral());
		System.out.println("�rea total: " + cone.areaCone());
		System.out.println("Litros: " + cone.litros());
		System.out.println("Latas: " + cone.latas());
		System.out.println("Pre�o Total: " + cone.preco());

	}

}
