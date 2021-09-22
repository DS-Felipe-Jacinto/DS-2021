package Classes;

public class Conta_Premium extends Conta implements Tributacao{
	
	public Conta_Premium(int Numero, int Agencia, double Saldo, String TitularConta) {
		super(Numero, Agencia, Saldo, TitularConta);
	}

	// Atributos (Caracter�sticas da Classe)
	private double Credito;
	
	// M�todos Acessores
	// Cr�dito
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
	
	// M�todo para apresentar ao usu�rio as informa��es da Classe
	public void infoConta() {
		System.out.println("TITULAR: " +this.getTitualConta());
		System.out.println("N�MERO: " +this.getNumero());
		System.out.println("AG�NCIA: " +this.getAgencia());
		System.out.println("SALDO: R$" +this.getSaldo());
		System.out.println("IMPOSTO DE 1%");
		System.out.println("SALDO (COM IMPOSTO): " +this.calcularImposto());
	}
}