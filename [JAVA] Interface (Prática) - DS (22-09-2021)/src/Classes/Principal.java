package Classes;

public class Principal {

	public static void main(String[] args) {
		
		// Na linha abaixo, s�o definidas as informa��es da class Conta_Corrente
		Conta_Corrente infoContaCorrente = new Conta_Corrente(5, 55, 1.856, "FELIPE JACINTO DOSA SANTOS");
		
		System.out.println("==================== EXTRATO ====================");
		infoContaCorrente.infoConta(); // Imprimi todos os dados do m�todo
		System.out.println("=================================================");
		System.out.println(""); // Espa�amento entre as impress�es de dados
		
		// Na linha abaixo, s�o definidas as informa��es da class Conta_Premium
		Conta infoContaPremium = new Conta_Premium(18, 199, 11.399, "THAYANI DA SILVA PEREIRA");
		System.out.println("==================== EXTRATO ====================");
		infoContaPremium.infoConta(); // Imprimi todos os dados do m�todo
		System.out.println("=================================================");
		System.out.println(""); // Espa�amento entre as impress�es de dados
	}
}