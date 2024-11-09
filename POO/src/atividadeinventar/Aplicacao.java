package atividadeinventar;

public class Aplicacao {
	public static void main(String[] args) {
		
		CadeiraFacul cadeira1 = new CadeiraFacul("Luciano", 40, 65, "POO");
		
		Carro carro1 = new Carro("BMW", "preto", 540000, false);
		
		Musica musica1 = new Musica("Katy Perry", true, "Não sei", true);
		
		System.out.println(cadeira1);
		System.out.println(carro1);
		System.out.println(musica1);
	}
}
