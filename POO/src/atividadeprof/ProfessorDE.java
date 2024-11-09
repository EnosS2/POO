package atividadeprof;

public class ProfessorDE extends Professor {

	public ProfessorDE(String nome, int matricula, int idade, double salarioDE) {
		super(nome, matricula, idade);
		this.salario = salarioDE;
	}
	@Override
	public void calculaSalario() {
		this.salario = this.salario * 2;
	}
}
