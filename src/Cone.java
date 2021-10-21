public class Cone {

	private float raio;
	private float altura;
	private int tipo;
	private int areatotal;
	private int arealat;
	private int areacir;


	public Cone(float raio, float altura, int tipo) {
		setRaio(raio);
		setAltura(altura);
		setTipo(tipo);
	}

	public Cone() {
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		if (altura > 0)
			this.altura = altura;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		if (raio > 0)
			this.raio = raio;
	}

	public float teorema() {
		return ((raio * raio) + (altura * altura));
	}

	public float geratriz() {
		return (float) Math.sqrt(teorema());
	}

	public float areatotal() {
		return (3.14f * raio * (raio + geratriz()));
	}

	public float areacir() {
		return 3.14f * raio * raio;
	}

	public float arealat() {
		return 3.14f * raio * geratriz();
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public float litros() {
			return (areacir + arealat + areatotal) * 18;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [raio=");
		builder.append(raio);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", areatotal=");
		builder.append(areatotal);
		builder.append(", arealat=");
		builder.append(arealat);
		builder.append(", areacir=");
		builder.append(areacir);
		builder.append(", teorema()=");
		builder.append(teorema());
		builder.append(", geratriz()=");
		builder.append(geratriz());
		builder.append(", areatotal()=");
		builder.append(areatotal());
		builder.append(", areacir()=");
		builder.append(areacir());
		builder.append(", arealat()=");
		builder.append(arealat());
		builder.append(", litros()=");
		builder.append(litros());
		builder.append("]");
		return builder.toString();
	}


}