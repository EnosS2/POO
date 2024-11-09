package atividadecontafacil;

public class ContaBancaria {
	private String nomeCorrentista;
	private float saldo;
	private boolean contaEspecial;

	public ContaBancaria(String nomeCorrentista, float saldo, boolean contaEspecial) {
		super();
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
		this.contaEspecial = contaEspecial;
	}

	public void deposita(float valor) {
		saldo = (saldo + valor);
	}

	public void retira(float valor) {
		if(valor > saldo) {
			System.out.println("Não possui saldo.");
		}
		else {
			saldo = (saldo-valor);
		}
	}

	public void mostraDados() {
		System.out.println("Nome do correntista: "+nomeCorrentista);
		System.out.println("Saldo correntista: "+saldo);
		if(contaEspecial) {
			System.out.println("Correntista possui conta especial.");
		}
		else {
			System.out.println("Correntista possui conta padrão.");
		}
	}
}
