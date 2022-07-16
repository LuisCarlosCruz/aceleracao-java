package pratica;
import java.util.Scanner;

public class Diagnostico {

	public static void main(String[] args) {
	    Avaliacao instancia = new Avaliacao();
		
	    Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe seu peso: ");
		
		String input1 = scanner.next();
		double peso = Double.parseDouble(input1);
		
		System.out.print("Informe altura: ");
		
		String input2 = scanner.next();
		double altura = Double.parseDouble(input2);
		
		scanner.close();
		
		instancia.calcularIMC(peso, altura);
		
	}

}
