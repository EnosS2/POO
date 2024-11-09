package atividaderegistro;

public class Aplicacao {
	public static void main(String[] args) {

		RegistroAcademico aluno1 = new RegistroAcademico("Edgar", 20323073, true);
		
		aluno1.mostraRegistro();
		aluno1.calculaMensalidade(1500);
	}
}
