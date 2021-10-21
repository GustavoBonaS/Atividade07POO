public class Cone {

	private float raio;
	private float altura;
	private int tipo;


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
	public float i() {
		return (float) (1/3.45);
	}
	
	public float litros() {
			return (areatotal() / i());
	}
	
	public int latas() {
		return (int) Math.ceil((litros()) / 18);
	}
	public double preco() {
		if (tipo == 1) {
			return (238.90);
		}else if (tipo == 2) {
			return (467.98);
		}else {
			return (758.34);
		}
			
	}
	
	public double precototal() {
		return (double) (latas() * preco());
	}
	

	@Override
	public String toString() {
		return "Cone \nraio= " + raio + "\naltura= " + altura + "\ntipo= " + tipo + "\ngeratriz()= " + geratriz()
				+ "\narea total= " + areatotal() + "\narea do fundo= " + areacir() + "\narea lateral= " + arealat()
				+ "\nlitros= " + litros() + "\nlatas()=" + latas() + "\npreco total= " + precototal();
	}


}