package atividadeimc;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		Paciente paciente1 = new Paciente();
		
		System.out.println("Informe seu nome: ");
		paciente1.setNome(leitura.nextLine());
		System.out.println("Informe seu endereço: ");
		paciente1.setEndereco(leitura.nextLine());
		System.out.println("Informe sua idade: ");
		paciente1.setIdade(leitura.nextInt());
		System.out.println("Informe sua altura: ");
		paciente1.setAltura(leitura.nextFloat());
		System.out.println("Informe seu peso: ");
		paciente1.setPeso(leitura.nextFloat());
		
		leitura.close();
		
		paciente1.mostraDados();
	}
}
