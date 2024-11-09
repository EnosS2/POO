package atividadeextraher;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		Retangulo ret1 = new Retangulo();
		Circunferencia cir1 = new Circunferencia();

		System.out.println("Informe a largura do retangulo: ");
		ret1.setLargura(leitura.nextDouble());
		System.out.println("Informe a altura do retangulo: ");
		ret1.setAltura(leitura.nextDouble());

		System.out.println("Informe o raio da circunferencia: ");
		cir1.setRaio(leitura.nextDouble());

		leitura.close();

		System.out.println("Área do retangulo: " + ret1.calculaArea());
		System.out.println("Perimetro do retangulo: " + ret1.calculaPerimetro());
		System.out.println("Área da circunferencia: "+ cir1.calculaArea());
		System.out.println("Perimetro da circunferencia: "+cir1.calculaPerimetro());
	}
}
