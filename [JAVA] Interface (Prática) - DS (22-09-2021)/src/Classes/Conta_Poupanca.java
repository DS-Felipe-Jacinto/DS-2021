package Classes;

public class Conta_Poupanca extends Conta{

	public Conta_Poupanca(int Numero, int Agencia, double Saldo, String TitularConta) {
		super(Numero, Agencia, Saldo, TitularConta);
	}

	// M�todos	
	public double rendimentoPoupanca() {
		return this.getSaldo() + 0.5;
	}
}