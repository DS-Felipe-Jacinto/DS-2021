package Classes;

public class Quadrado extends Formas{
	
	public double calcularArea(){
		return this.getValor() * this.getValor();
	}
	
	public void mostrarResultado(){
		System.out.println("Valor Inserido: " +this.getValor());
		System.out.println("Área: " +this.calcularArea());
	}
}