package lista03;

public class Exer15 {
	public static void main(String[] args) {

		int s = 0;
		for (int i = 38; i >= 1; i--) {
			for (int j = 1; j <= 37; j++) {
				s = s + (((i - 1) * i) / j);
			}
		}
		System.out.println("Resultado: " + s);
	}
}
