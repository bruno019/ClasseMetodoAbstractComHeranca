package entidades;

public class PessoaFisica extends Pessoa {
	private Double gastoSaude;
	
	//Construtores
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	
	//Getters e Setters
	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	//Metodos
		@Override
		public Double calcularImposto() {
			Double imposto = (getRendaAnual()<20000.0)? getRendaAnual()*0.15 : getRendaAnual()*0.25;
			
			imposto -= getGastoSaude()*0.50;
			if(imposto<0.0) {
				imposto =0.0;
			}return imposto;
		}

		
}
