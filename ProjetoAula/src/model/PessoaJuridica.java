package model;

public class PessoaJuridica extends Pessoa {
	private String empresa;
	private long cnpj;
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void falar() {
		// TODO Auto-generated method stub
		System.out.println("Falando - Pessoa Jurídica");
	}

}
