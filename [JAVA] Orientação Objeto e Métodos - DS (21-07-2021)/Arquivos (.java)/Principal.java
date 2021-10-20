package Classes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		try (Scanner inserir = new Scanner(System.in)) {
			Pessoa infoPessoa = new Pessoa();
			
			//Aqui o usuário digita o Nome!
			System.out.println("Digite seu Nome: ");
			infoPessoa.setNome(inserir.nextLine());
			
			//E por último, o usuário digita a Altura!
			System.out.println("Digite sua Altura: ");
			infoPessoa.setAltura(inserir.nextDouble());

			/* Nesta última linha do código será usado o método <imprimirDadosPessoa>
			   este método irá imprimir os dados inseridos anteriormente pelo Usuário */
			System.out.println(""); //Espaçamento entre as linhas
			infoPessoa.imprimirDadosPessoa();
		}
	}
}