package entidades;

public class Empresa extends Contribuinte {

	private Integer numFuncionarios;

	public Empresa(String nome, Double rendimentoAnual, Integer numFuncionarios) {
		super(nome, rendimentoAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double imposto() {
		
		if (this.getNumFuncionarios() <= 10) {

			return (this.getRendimentoAnual() * 16) / 100.0;

		} else {

			return (this.getRendimentoAnual() * 14) / 100;

		}  

	}
}