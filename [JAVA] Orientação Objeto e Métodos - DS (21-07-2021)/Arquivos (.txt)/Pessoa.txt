/* <-- EXERCÍCIO -->
Criar uma classe pessoa com os atributos nome e altura, 
seus métodos assessores e duas funções, 
uma para imprimir as informações da classe e outra para exibir uma frase dita pela 'pessoa', 
essa função pode ser chamada passando uma frase como parâmetro ou não, 
além disso a classe precisa ter seus construtores
*/

package Classes;

public class Pessoa {
	String Nome;
	double Altura;
	
	//Construtor
	public Pessoa() {
	}
	
	public Pessoa(String Nome, double Altura) {
		this.Nome = Nome;
		this.Altura = Altura;
	}
	
	/* <-- EXPLICAÇÃO -->
	 * GET = Não possuí parâmetros mas com retorno!
	 * SET = Possuí parâmetros mas sem retorno
	*/
	
	//Métodos Acessores
	
	//Nome
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	//Altura
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double Altura) {
		this.Altura = Altura;
	}

	//Imprimindo os dados para o Usuário
	public void imprimirDadosPessoa() {
		System.out.println("<----------- DADOS ----------->");
		System.out.println("Nome: " +this.Nome);
		System.out.println("Altura: " +this.Altura+ "m");
		System.out.println("Não pare até se orgulhar!");
	}
	
	//Agora vamos para a classe Principal!
}