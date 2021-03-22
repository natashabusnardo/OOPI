package lista03;

public class Exer04 {

	
	public static void main(String[] args) {
		double popa = 80000;
		double popb = 200000;
		
		double cresca = 0.03;
		double crescb = 0.015;
		
		int anos = 0;
		
		while (popa<popb) {
			anos++;
			popa = popa + popa*cresca;
			popb = popb + popb*crescb;
			
		}
		
		System.out.println("A população A vai demorar "+anos+ " anos para ultrapassar a população B.");
		
	}
}
