/* <-- EXERC�CIO -->
Criar uma classe pessoa com os atributos nome e altura, 
seus m�todos assessores e duas fun��es, 
uma para imprimir as informa��es da classe e outra para exibir uma frase dita pela 'pessoa', 
essa fun��o pode ser chamada passando uma frase como par�metro ou n�o, 
al�m disso a classe precisa ter seus construtores
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
	
	/* <-- EXPLICA��O -->
	 * GET = N�o possu� par�metros mas com retorno!
	 * SET = Possu� par�metros mas sem retorno
	*/
	
	//M�todos Acessores
	
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

	//Imprimindo os dados para o Usu�rio
	public void imprimirDadosPessoa() {
		System.out.println("<----------- DADOS ----------->");
		System.out.println("Nome: " +this.Nome);
		System.out.println("Altura: " +this.Altura+ "m");
		System.out.println("N�o pare at� se orgulhar!");
	}
	
	//Agora vamos para a classe Principal!
}