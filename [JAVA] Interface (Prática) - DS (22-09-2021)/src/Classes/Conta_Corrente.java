package Classes;

public class Conta_Corrente extends Conta implements Tributacao{

	// M�todos
	
	public Conta_Corrente(int Numero, int Agencia, double Saldo, String TitularConta) {
		super(Numero, Agencia, Saldo, TitularConta);
	}

	public double Sacar(double Saque) {
		return this.getSaldo() - Saque;
	}

	@Override
	public double calcularImposto() {
		return this.getSaldo() - 0.02;
	}
	
	// M�todo para apresentar ao usu�rio as informa��es da Classe
	public void infoConta() {
		System.out.println("TITULAR: " +this.getTitualConta());
		System.out.println("N�MERO: " +this.getNumero());
		System.out.println("AG�NCIA: " +this.getAgencia());
		System.out.println("SALDO: R$" +this.getSaldo());
		System.out.println("AP�S O SAQUE: R$" +this.Sacar(1.212));
		System.out.println("IMPOSTO DE 2%");
		System.out.println("SALDO (COM IMPOSTO): " +this.calcularImposto());
	}
}