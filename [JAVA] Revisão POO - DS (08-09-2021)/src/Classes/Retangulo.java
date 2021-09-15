package Classes;

public class Retangulo extends Formas{
	
	private double Base;
	private double Altura;
	
	public double getBase() {
		return Base;
	}

	public void setBase(double base) {
		Base = base;
	}
	
	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	public double calcularArea(){
		return this.getBase() * this.getAltura();
	}
	
	public void mostrarResultado(){
		System.out.println("Valor da Base: " +this.getBase());
		System.out.println("Valor da Altura: " +this.getAltura());
		System.out.println("Área: " +this.calcularArea());
	}
}