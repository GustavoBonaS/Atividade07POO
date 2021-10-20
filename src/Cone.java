public class Cone {

	private float raio;
	private float altura;
	private float tipo;
	private double teorema;
	
	public Cone (float raio, float altura) {
		setRaio(raio);
		setAltura(altura);
	}
	
	public Cone() {
		setAltura(altura);
	}

	private void setTipo(int tipo) {
					
	}

	public void setAltura(float altura) {
		if (altura > 0)
			this.altura = altura;
	}
	
	public float getAltura() {
		return altura;
	}

	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		if (raio > 0)
			this.raio = raio;
	}
	
	public double teorema() {
		return Math.sqrt((altura * altura) + (raio * raio));
	}
	public double areatotal () {
		return (3.14 * raio * (raio + teorema));		
	}
	public double areacir() {
		return 3.14 * raio * raio;	
	}
	public double arealat() {
		return 3.14 * raio * teorema;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("-->Cone");
		builder.append("\nRaio: "+raio );
		builder.append("\nAltura: "+altura);
		builder.append("\nTipo: "+tipo);
		return builder.toString();
		
	}
	
	
	
	
	
}