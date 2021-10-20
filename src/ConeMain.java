import java.util.Scanner;

public class ConeMain {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		Cone cone = new Cone();
		System.out.println("Insira o raio: ");
		cone.setRaio(ent.nextFloat());
		System.out.println(cone);
		
		Cone cone2 = new Cone();
		System.out.println("Insira  a altura: ");
		cone2.setRaio(ent.nextFloat());
		
		System.out.println("Geratriz: "+cone.teorema());
		System.out.println("Area total: "+cone.areatotal());

		
	}

}
