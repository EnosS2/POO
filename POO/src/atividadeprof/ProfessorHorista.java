package atividadeprof;

public class ProfessorHorista extends Professor {
	private int totalHoras;
	private double salarioHora;

	public ProfessorHorista(String nome, int matricula, int idade, int totalHoras, double salarioHora) {
		super(nome, matricula, idade);
		this.totalHoras = totalHoras;
		this.salarioHora = salarioHora;
	}
	@Override
	public void calculaSalario() {
		salario = (salarioHora * totalHoras);
	}

}
