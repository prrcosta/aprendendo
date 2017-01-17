class FuncionarioBanco {
	String nome;
	String sobrenome;
	String departamento;
	String dataDeAdmissao;
	String RG;
	double salario;
	void ganhoAnual() {
		double ganhoAnual = this.salario * 12;
		System.out.println("Salario anual do Funcionario = "+ganhoAnual);
	}
	void recebePromocao(double valor) {
		this.salario = valor;
		System.out.println("Salario atualizado com sucesso!");
		System.out.println(salario);
	}
	boolean identificacao() {
		if (salario > 0) {
			System.out.println("Funcionario");
			return true;
		}
		else {
			System.out.println("Parceiro");
			return false;
		}
	}
}