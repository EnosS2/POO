package atividadeindice;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {

		String nome;

		Scanner leitura = new Scanner(System.in);

		System.out.println("Informe seu nome completo: ");
		nome = leitura.nextLine();
		
		leitura.close();

		System.out.println("Número de caracteres: " + nome.length());
		System.out.println("Índice da última letra do primeiro nome: " + nome.indexOf('r'));
		System.out.println("Nome completo em maiúsculo: " + nome.toUpperCase());
		System.out.println("Nome com subistuição: "+ nome.replace("Edgar", "Teste"));
	}
}
