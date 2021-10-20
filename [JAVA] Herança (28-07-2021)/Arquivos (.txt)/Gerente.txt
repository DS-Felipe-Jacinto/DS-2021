package Classes;

//Criando a classe Gerente que herda da classe Funcionario
	public class Gerente extends Funcionario{
	// A classe Gerente tem todos os atributos da classe Funcionario + o atributo Senha
	private double Senha;
		
	// Método criado para o Gerente conseguir se autenticar no sistema
	public boolean Autenticar(double Senha) {
		if(this.Senha == Senha) {
			return true;
		}else
			return false;
		}
	
	// Método getcalcularComissao() utilizando sobrescrita sobre a classe Funcionario
	@Override
		public double calcularComissao() {
		
	/* - Utilizamos o super. para invocar métodos ou atributos da classe mãe.
	- Utilizamos o super.getSalario() em vez do super.salario, pois o salario e um atributo do tipo private.
	- O método foi sobrescrito da forma como é feito o sistema de bônus para os gerentes 
	que é diferente de un funcionario normal. */
		return 0.15 * super.getSalario();
		}
		
	// GETTERS E SETTERS EXCLUSIVOS DA CLASSE GERENTE
		public void setSenha(double Senha) {
			this.Senha = Senha;
		}
	}