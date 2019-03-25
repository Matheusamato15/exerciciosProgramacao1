package Exercicio8;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.setNome("Matheus Amato");
		f.setCpf("701.593.831-61");
		f.setHorasTrabalhadas(132);
		f.setValorHoraTrabalho(15.00);
		
		System.out.print("Funcionário: "+f.getNome() +"\n");
		System.out.print("CPF: "+f.getCpf() +"\n");
		System.out.print("Quantidade de horas trabalhadas: "+f.getHorasTrabalhadas() +"\n");
		System.out.print("Valor por hora trabalhada: "+f.getValorHoraTrabalho() +"\n");
		System.out.printf("Seu salário: %.2f\n", f.salario());
		
	}

}
