package entidades;

public class PessoaJuridica extends Pessoa{
	private Integer nFuncionarios;
	
	//Construtores
	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(String nome, Double rendaAnual, Integer nFuncionarios) {
		super(nome, rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}
	
	
	//Getters e Setters
	public Integer getnFuncionarios() {
		return nFuncionarios;
	}
	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}
	
	
	//Metodos
	@Override
	public Double calcularImposto() {
		Double imposto;
		if(getnFuncionarios()<=10) {
			imposto = getRendaAnual()*0.16;
		}else {
			imposto = getRendaAnual()*0.14;
		}
		return imposto;
	}
	
	
}
