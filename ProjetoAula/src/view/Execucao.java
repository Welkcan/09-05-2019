package view;

import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;


public class Execucao {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setCpf(800000);
		pf.setEnd("Rua Colônia D'Assunção");
		pf.setNome("Guilherme Ramos Serra");
		pf.setBairro("Itaim Paulista");
		pf.setEstado("São Paulo");
		pf.setCidade("São Paulo");
		pf.setTel(983531008);
		
		
		pj.setCnpj(854656);
		pj.setEnd("Rua Avenida Tavares");
		pj.setEmpresa("Grop Corporation");
		pj.setBairro("Tatuapé");
		pj.setEstado("São Paulo");
		pj.setCidade("São Paulo");
		pj.setTel(25664838);
		
		
		System.out.println("Nome: " + pf.getNome());
		System.out.println("Endereço: " + pf.getEnd());
		System.out.println("Bairro: " + pf.getBairro());
		System.out.println("Cidade: " +pf.getCidade());
		System.out.println("Estado: " +pf.getEstado());
		System.out.println("CPF: " +pf.getCpf());
		System.out.println("Telefone: " +pf.getTel());
		pf.falar();
		
		System.out.println("   ");
		
		System.out.println("Razão Social: " + pj.getEmpresa());
		System.out.println("Endereço: " + pj.getEnd());
		System.out.println("Bairro: " + pj.getBairro());
		System.out.println("Cidade: " +pj.getCidade());
		System.out.println("Estado: " +pj.getEstado());
		System.out.println("CPF: " +pj.getCnpj());
		System.out.println("Telefone: " +pj.getTel());
		pj.falar();

	}

}
