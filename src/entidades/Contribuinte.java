package entidades;

public abstract class Contribuinte {

	private String nome;
	private Double rendimentoAnual;
	
	public Contribuinte() {
	
	}

	public Contribuinte(String nome, Double rendimentoAnual) {
		this.nome = nome;
		this.rendimentoAnual = rendimentoAnual;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendimentoAnual() {
		return rendimentoAnual;
	}

	public void setRendimentoAnual(Double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}

	public abstract double imposto();
		
	
	@Override
	public String toString() {
		return this.getNome() + ": $ " + String.format("%.2f", this.imposto()) + "\n";
	}
	
}