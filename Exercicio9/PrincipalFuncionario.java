package Exercicio9;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.setNome("Matheus Amato");
		f.setNumeroFilhos(2);
		f.setSalario(9678.32);
		
		System.out.print("Nome: "+f.getNome() +"\n");
		System.out.print("Quantidade de filhos: "+f.getNumeroFilhos() +"\n");
		System.out.print("Salário: "+f.getSalario() +" R$ \n");
		System.out.printf("Desconto no imposto de renda: %.2f R$\n", f.desconto());
		System.out.printf("INSS %.2f R$", f.inss());
		
	}

}
