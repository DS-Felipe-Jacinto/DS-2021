package Classes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		/* ====================================================================================== */
		// Dados do Quadrado
		Quadrado infoQuadrado = new Quadrado();
		
		System.out.println("Insira o valor para calcular a �rea do Quadrado: ");
		infoQuadrado.setValor(entrada.nextDouble());
		
		System.out.println("============== QUADRADO ==============");
		infoQuadrado.mostrarResultado();
		System.out.println("======================================");
		System.out.println("");
		
		/* ====================================================================================== */
		// Dados do Ret�ngulo
		Retangulo infoRetangulo = new Retangulo();
		
		System.out.println("Insira o valor da base para calcular a �rea do Ret�ngulo: ");
		infoRetangulo.setBase(entrada.nextDouble());
		
		System.out.println("Insira o valor da altura para calcular a �rea do Ret�ngulo: ");
		infoRetangulo.setAltura(entrada.nextDouble());
	
		System.out.println("============== RET�NGULO ==============");
		infoRetangulo.mostrarResultado();
		System.out.println("=======================================");
		System.out.println("");
		
		/* ====================================================================================== */
		// Dados do Circulo
		Circulo infoCirculo = new Circulo();
				
		System.out.println("Insira o valor do raio para calcular a �rea do C�rculo: ");
		infoCirculo.setRaio(entrada.nextDouble());
			
		System.out.println("============== C�RCULO ==============");
		infoCirculo.mostrarResultado();
		System.out.println("=======================================");
		System.out.println("");
		
		/* ====================================================================================== */
		// Dados do Tri�ngulo
		Triangulo infoTri�ngulo = new Triangulo();
				
		System.out.println("Insira o valor da base para calcular a �rea do Tri�ngulo: ");
		infoTri�ngulo.setBase(entrada.nextDouble());
				
		System.out.println("Insira o valor da altura para calcular a �rea do Tri�ngulo: ");
		infoTri�ngulo.setAltura(entrada.nextDouble());
			
		System.out.println("============== TRI�NGULO ==============");
		infoTri�ngulo.mostrarResultado();
		System.out.println("=======================================");
	}
}