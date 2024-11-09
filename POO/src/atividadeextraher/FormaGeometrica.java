package atividadeextraher;

public abstract class FormaGeometrica {
	
	public FormaGeometrica(){
		
	}
	public void descricao() {
		System.out.println("Sou uma forma geométrica.");
	}
	public abstract double calculaArea();
	public abstract double calculaPerimetro();
}
