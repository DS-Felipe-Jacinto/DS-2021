package Classes;

public class Funcionario {
	private String Nome;
	private String CPF;
	private Double Salario;
	
	public double calcularComissao() { //M�todo para pegar a Bonifica��o
		return this.Salario * 0.10;
	}
	
	//Getters e Setters
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public void setSalario(double Salario) {
		this.Salario = Salario;
	}
	public double getSalario() {
		return this.Salario;
	}
}