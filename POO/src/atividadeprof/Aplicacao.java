package atividadeprof;

public class Aplicacao {
	public static void main(String[] args) {

		ProfessorDE prof1 = new ProfessorDE("Viviane", 20323073, 32, 10404.0);
		ProfessorHorista prof2 = new ProfessorHorista("Ana Paula", 203230, 35, 160, 150);

		prof1.calculaSalario();
		System.out.println("Salário professor(a) DE: " + prof1.getSalario());
		prof2.calculaSalario();
		System.out.println("Salário professor(a) horista: " + prof2.getSalario());
	}
}
