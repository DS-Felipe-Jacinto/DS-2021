package Classes;

public class Conta_Premium extends Conta implements Tributacao{
	
	public Conta_Premium(int Numero, int Agencia, double Saldo, String TitularConta) {
		super(Numero, Agencia, Saldo, TitularConta);
	}

	// Atributos (Características da Classe)
	private double Credito;
	
	// Métodos Acessores
	// Crédito
	public double getCredito() {
		return Credito;
	}

	public void setCredito(double credito) {
		Credito = credito;
	}

	@Override
	public double calcularImposto() {
		return this.getSaldo() - 0.01;
	}
	
	// Método para apresentar ao usuário as informações da Classe
	public void infoConta() {
		System.out.println("TITULAR: " +this.getTitualConta());
		System.out.println("NÚMERO: " +this.getNumero());
		System.out.println("AGÊNCIA: " +this.getAgencia());
		System.out.println("SALDO: R$" +this.getSaldo());
		System.out.println("IMPOSTO DE 1%");
		System.out.println("SALDO (COM IMPOSTO): " +this.calcularImposto());
	}
}