package entidades;

public class Individual extends Contribuinte {

	private Double gastoSaude;

	public Individual(String nome, Double rendimentoAnual, Double gastoSaude) {
		super(nome, rendimentoAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {

		if (this.getRendimentoAnual() <= 20000) {

			return (this.getRendimentoAnual() * 15) / 100.0;

		} else if (this.getRendimentoAnual() <= 20000 && this.getGastoSaude() > 0) {

			return ((this.getRendimentoAnual() * 15) / 100) - ((this.getGastoSaude() * 50) / 100);

		} else if (this.getRendimentoAnual() > 20000 && this.getGastoSaude() > 0) {

			return ((this.getRendimentoAnual() * 25) / 100) - ((this.getGastoSaude() * 50) / 100);
		} else {
			return (this.getRendimentoAnual() * 25) / 100;
		}

	}
}
