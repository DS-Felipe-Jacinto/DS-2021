package Classes;

public abstract class Conta{
	
	// Atributos (Características da Classe)
	private int Numero;
	private int Agencia;
	private double Saldo;
	private String TitualConta;
	
	// Métodos Acessores
	public Conta (int Numero, int Agencia, double Saldo, String TitularConta) {
		this.Numero = Numero;
		this.Agencia = Agencia;
		this.Saldo = Saldo;
		this.TitualConta = TitularConta;
	}
	
	// Número
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	
	// Agência
	public int getAgencia() {
		return Agencia;
	}
	public void setAgencia(int agencia) {
		Agencia = agencia;
	}
	
	// Saldo
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	// Titular
	public String getTitualConta() {
		return TitualConta;
	}
	public void setTitualConta(String titualConta) {
		TitualConta = titualConta;
	}
	
	public double Sacar(double Saque) {
		return 0;
	}
	
	public void Depositar() {
	}
	
	public void infoConta() {
	}
}