package atividadelamp;

public class Lampada {
	private String estadoDaLampada;

	Lampada() {
		this.estadoDaLampada = "apagada";
	}

	public void acende() {
		this.estadoDaLampada = "acesa";
	}

	public void apaga() {
		this.estadoDaLampada = "apagada";
	}

	public void mostraEstado() {
		System.out.println("A lampada está: " + estadoDaLampada);
	}
}
