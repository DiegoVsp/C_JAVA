package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AreaDois {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);

		double A, B, C, areaTri, areaCirc, areaTrap, areaQuad, areaRet;
		final double PI = 3.14159;

		System.out.println("Digite um valor para A: ");
		A = entrada.nextDouble();

		System.out.println("Digite um valor para B: ");
		B = entrada.nextDouble();

		System.out.println("Digite um valor para C: ");
		C = entrada.nextDouble();
		
		areaTri = (A*C)/2;
		areaCirc = PI*Math.pow(C, 2);
		areaTrap =(A+B)*C/2;
		areaQuad = Math.pow(B,2);
		areaRet= A*B;
		
		System.out.printf("Tri�ngulo %.3f%n",areaTri);
		System.out.printf("Circulo %.3f%n",areaCirc);
		System.out.printf("Trap�zio %.3f%n",areaTrap);
		System.out.printf("Quadrado %.3f%n",areaQuad);
		System.out.printf("Ret�ngulo %.3f%n",areaRet);
		
		entrada.close();
	}
}
