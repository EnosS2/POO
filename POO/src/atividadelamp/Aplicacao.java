package atividadelamp;

public class Aplicacao {
	public static void main(String[] args) {
		
		Lampada lamp1 = new Lampada();
		
		lamp1.mostraEstado();
		lamp1.acende();
		lamp1.mostraEstado();
		lamp1.apaga();
		lamp1.mostraEstado();
	}
}
