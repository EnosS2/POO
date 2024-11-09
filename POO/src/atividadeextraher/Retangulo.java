package atividadeextraher;

public class Retangulo extends FormaGeometrica{
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}
	
	public Retangulo() {
		
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() {
		double area = (largura*altura);
		return area;
	}
	
	@Override
	public double calculaPerimetro() {
		double perimetro = (2*(largura+altura));
		return perimetro;
	}
}
