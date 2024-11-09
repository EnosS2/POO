package atividaderegistro;

public class RegistroAcademico {
	private String nomeAluno;
	private int numeroMatricula;
	private boolean eBolsista;

	public RegistroAcademico(String nomeAluno, int numeroMatricula, boolean eBolsista) {
		super();
		this.nomeAluno = nomeAluno;
		this.numeroMatricula = numeroMatricula;
		this.eBolsista = eBolsista;
	}
	public void mostraRegistro() {
		System.out.println("Aluno: "+nomeAluno);
		System.out.println("Matrícula: "+numeroMatricula);
		if(eBolsista) {
			System.out.println("Bolsista: sim");
		}
		else {
			System.out.println("Bolsista: não");
		}
	}
	public void calculaMensalidade(float valMensalidade) {
		if(eBolsista) {
			valMensalidade = (valMensalidade/2);
			System.out.println("Valor da mensalidade: "+valMensalidade);
		}
		else {
			System.out.println("Valor da mensalidade: "+valMensalidade);
		}
	}
}
