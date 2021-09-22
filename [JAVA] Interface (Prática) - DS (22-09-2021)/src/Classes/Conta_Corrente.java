package Classes;

public class Conta_Corrente extends Conta implements Tributacao{

	// Métodos
	
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
	
	// Método para apresentar ao usuário as informações da Classe
	public void infoConta() {
		System.out.println("TITULAR: " +this.getTitualConta());
		System.out.println("NÚMERO: " +this.getNumero());
		System.out.println("AGÊNCIA: " +this.getAgencia());
		System.out.println("SALDO: R$" +this.getSaldo());
		System.out.println("APÓS O SAQUE: R$" +this.Sacar(1.212));
		System.out.println("IMPOSTO DE 2%");
		System.out.println("SALDO (COM IMPOSTO): " +this.calcularImposto());
	}
}