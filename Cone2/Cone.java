
public class Cone {

	private double z;
	private double r;
	private int tipoDeTinta;

	final double pi = 3.14;

	final float metrosPintados = (float) 3.45;

	public Cone() {}
	
	public Cone(double r, double z) {}
	
	public Cone(double r, double z, int tipoDeTinta) {
		setR(r);
		setZ(z);
		setTipoDeTinta(tipoDeTinta);
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public int getTipoDeTinta() {
		return tipoDeTinta;
	}

	public void setTipoDeTinta(int tipoDeTinta) {
		this.tipoDeTinta = tipoDeTinta;
	}

	public double g() {
		return Math.sqrt(r * r + z * z);
	}

	public double areaFundo() {
		return pi * (r * r);
	}

	public double areaLateral() {
		return pi * r * g();
	}

	public double areaCone() {
		return pi * r * (r + g());
	}

	public double litros() {
		return (areaCone() * metrosPintados);
	}

	public int latas() {
		return (int) Math.ceil(litros() / 18);
	}

	public float valor() {
		switch (tipoDeTinta) {
		case 1:
			return (float) 238.90;
		case 2:
			return (float) 467.98;
		default:
			return (float) 758.34;
		}
	}

	public float preco() {
		return latas() * valor();
	}

	@Override
	public String toString() {
		return "Cone [z=" + z + ", r=" + r + ", tipoDeTinta=" + tipoDeTinta + "]";
	}

}
