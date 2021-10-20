package Classes;

public class Principal {

	public static void main(String[] args) {
		
		// Instanciando a classe Funcionario
		Funcionario Doni = new Funcionario();
		
		Doni.setCPF("12344466");
		Doni.setNome("Danadoni Lima");
		Doni.setSalario(3100);
		System.out.println("Bonificação do Funcionário: " +Doni.calcularComissao());
		
		// Instanciando a classe Gerente
		Gerente Pedro = new Gerente();
		
		/* Graças ao conceito de Herança, mesmo não tendo escrito esse GETTES e SETTERS
		conseguimos utilizar com a classe Gerente */
		Pedro.setCPF("12344466");
		Pedro.setNome("Pedro Lima");
		Pedro.setSalario(4000);
		System.out.println("Bonificação do Gerente: " +Pedro.calcularComissao());
	}
}