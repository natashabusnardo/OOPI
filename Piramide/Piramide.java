
public class Piramide {

	private float h;
	private float ab;
	private float b;
	private float a1;
	private float areaBase;
	private float areaTriangulo;
	private float areaTotal;


	private int tinta = 0;
	private float valor = (float) 0;

	final float metrosPintados = (float) 4.76;
	float litros;
	float latas;
	float preco;
	float volume;

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public float getAb() {
		return ab;
	}

	public void setAb(float ab) {
		this.ab = ab;
	}

	public float getB() {
		return b;
	}

	public void setB() {
		this.b = (ab + ab);
	}
	public float getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal() {
		this.areaTotal = areaBase + (areaTriangulo * 4);
	}


	public float getA1() {
		return a1;
	}

	public void setA1() {
		this.a1 = (float) Math.sqrt((float) (Math.pow(h, 2)) + (float) (Math.pow(ab, 2)));
		;
	}

	public float getAreaBase() {
		return areaBase;
	}

	public void setAreaBase() {
		this.areaBase = b * b;
	}

	public float getAreaTriangulo() {
		return areaTriangulo;
	}

	public void setAreaTriangulo() {
		this.areaTriangulo = (b * a1) / 2;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros() {
		this.litros = (areaTotal / metrosPintados);
	}

	public float getLatas() {
		return latas;
	}

	public void setLatas() {
		this.latas = (int) Math.ceil(litros / 18);
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco() {
		this.preco = latas * valor;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume() {
		this.volume = ((areaBase / (float) 3) * h);
	}

	public float getMetrosPintados() {
		return metrosPintados;
	}
	
	public int getTinta() {
        return tinta;
    }

    public void setTinta(int tinta) {
        this.tinta = tinta;
    }
    

	public float getValor() {
		return valor;
	}

	public void setValor() {
		switch (tinta) {
		case 1:
			valor = (float) 127.90;
			break;
		case 2:
			valor = (float) 258.98;
			break;
		case 3:
			valor = (float) 344.34;
			break;
		default:
			valor = (float) 0.0;
			break;
		}
	}

}
