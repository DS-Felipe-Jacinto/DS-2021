package Classes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		/* ====================================================================================== */
		// Dados do Quadrado
		Quadrado infoQuadrado = new Quadrado();
		
		System.out.println("Insira o valor para calcular a Área do Quadrado: ");
		infoQuadrado.setValor(entrada.nextDouble());
		
		System.out.println("============== QUADRADO ==============");
		infoQuadrado.mostrarResultado();
		System.out.println("======================================");
		System.out.println("");
		
		/* ====================================================================================== */
		// Dados do Retângulo
		Retangulo infoRetangulo = new Retangulo();
		
		System.out.println("Insira o valor da base para calcular a Área do Retângulo: ");
		infoRetangulo.setBase(entrada.nextDouble());
		
		System.out.println("Insira o valor da altura para calcular a Área do Retângulo: ");
		infoRetangulo.setAltura(entrada.nextDouble());
	
		System.out.println("============== RETÂNGULO ==============");
		infoRetangulo.mostrarResultado();
		System.out.println("=======================================");
		System.out.println("");
		
		/* ====================================================================================== */
		// Dados do Circulo
		Circulo infoCirculo = new Circulo();
				
		System.out.println("Insira o valor do raio para calcular a Área do Círculo: ");
		infoCirculo.setRaio(entrada.nextDouble());
			
		System.out.println("============== CÍRCULO ==============");
		infoCirculo.mostrarResultado();
		System.out.println("=======================================");
		System.out.println("");
		
		/* ====================================================================================== */
		// Dados do Triângulo
		Triangulo infoTriângulo = new Triangulo();
				
		System.out.println("Insira o valor da base para calcular a Área do Triângulo: ");
		infoTriângulo.setBase(entrada.nextDouble());
				
		System.out.println("Insira o valor da altura para calcular a Área do Triângulo: ");
		infoTriângulo.setAltura(entrada.nextDouble());
			
		System.out.println("============== TRIÂNGULO ==============");
		infoTriângulo.mostrarResultado();
		System.out.println("=======================================");
	}
}