package Classes;

public class Principal {

	public static void main(String[] args) {
		
		// Na linha abaixo, são definidas as informações da class Conta_Corrente
		Conta_Corrente infoContaCorrente = new Conta_Corrente(5, 55, 1.856, "FELIPE JACINTO DOSA SANTOS");
		
		System.out.println("==================== EXTRATO ====================");
		infoContaCorrente.infoConta(); // Imprimi todos os dados do método
		System.out.println("=================================================");
		System.out.println(""); // Espaçamento entre as impressões de dados
		
		// Na linha abaixo, são definidas as informações da class Conta_Premium
		Conta infoContaPremium = new Conta_Premium(18, 199, 11.399, "THAYANI DA SILVA PEREIRA");
		System.out.println("==================== EXTRATO ====================");
		infoContaPremium.infoConta(); // Imprimi todos os dados do método
		System.out.println("=================================================");
		System.out.println(""); // Espaçamento entre as impressões de dados
	}
}