package atividadecontafacil;

public class Aplicacao {
	public static void main(String[] args) {

		ContaBancaria cliente1 = new ContaBancaria("Edgar", 2500, true);
		
		cliente1.deposita(1000);
		cliente1.retira(2000);
		cliente1.mostraDados();
	}
}
