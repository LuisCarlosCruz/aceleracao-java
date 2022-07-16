package pratica;

import java.lang.Math;

public class Avaliacao {

	public static void calcularIMC(double peso, double altura) {
		double imc = peso / Math.pow(altura, 2);
		System.out.println("Seu IMC é :" + imc);
	}
}
