package atividadeextraher;

public class Circunferencia extends FormaGeometrica {
	private double raio;

	public Circunferencia(double raio) {
		super();
		this.raio = raio;
	}
	
	public Circunferencia() {
		
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calculaArea() {
		double area = (Math.PI*(Math.pow(raio, 2)));
		return area;
	}
	@Override
	public double calculaPerimetro() {
		double perimetro = (2*(Math.PI*raio));
		return perimetro;
	}
}
