package atividadeimc;

public class Paciente {

	private String nome;
	private String endereco;
	private int idade;
	private float altura;
	private float peso;

	public Paciente(String nome, String endereco, int idade, float altura, float peso) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public Paciente() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void calculaIMC() {
		double IMC = (peso / Math.pow(altura, 2));
		System.out.println("IMC: " + IMC);
	}

	public void mostraDados() {
		System.out.println("Nome do paciente: " + nome);
		System.out.println("Idade do paciente: " + idade);
		System.out.println("Endereço do paciente: " + endereco);
		System.out.println("Altura do paciente: " + altura);
		System.out.println("Peso do paciente: " + peso);
		calculaIMC();
	}
}
