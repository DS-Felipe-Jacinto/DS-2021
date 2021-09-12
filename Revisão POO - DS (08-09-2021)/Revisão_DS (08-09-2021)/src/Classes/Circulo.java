package Classes;

public class Circulo extends Formas{
	
	private double valorPI = 3.14;
	private double Raio;
	
	public double getValorPI() {
		return valorPI;
	}
	public void setValorPI(double valorPI) {
		this.valorPI = valorPI;
	}
	public double getRaio() {
		return Raio;
	}
	public void setRaio(double raio) {
		Raio = raio;
	}
	
	public double calcularArea(){
		return this.getValorPI() * this.getRaio() * 2;
	}
	
	public void mostrarResultado(){
		System.out.println("Valor do Raio: " +this.getRaio());
		System.out.println("Área: " +this.calcularArea());
	}
}