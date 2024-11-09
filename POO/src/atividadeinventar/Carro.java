package atividadeinventar;

public class Carro {
	private String marca;
	private String cor;
	private int preco;
	private boolean eletrico;

	public Carro(String marca, String cor, int preco, boolean eletrico) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.preco = preco;
		this.eletrico = eletrico;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public boolean isEletrico() {
		return eletrico;
	}

	public void setEletrico(boolean eletrico) {
		this.eletrico = eletrico;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", cor=" + cor + ", preco=" + preco + ", eletrico=" + eletrico + "]";
	}
	
}
