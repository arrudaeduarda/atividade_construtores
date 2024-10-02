package construtores;

public class Animal {

	private float tamanho;
	private String cor;
	
	public Animal () {
	}
	
	public Animal (String cor) {
		this.cor = cor;
	}
	public Animal(String cor, float tamanho) {
		this.cor = cor; 
		this.tamanho= tamanho;
	}
	public String getcor() {
		return cor;
	}

	public void setcor(String cor) {
		this.cor = cor;
	}
	public float gettamanho() {
		return tamanho;
	}

	public void tamanho(float tamanho) {
		this.tamanho = tamanho;
	}

}
