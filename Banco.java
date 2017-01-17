class Banco {
	public static void main(String[] args) {
		FuncionarioBanco novoFuncionario = new FuncionarioBanco();
		novoFuncionario.nome = "Pedro";
		novoFuncionario.sobrenome = "Reis Ribeiro da Costa";
		novoFuncionario.departamento = "Gerente";
		novoFuncionario.RG = "MG 11.124.363";
		novoFuncionario.salario = 4000;
		novoFuncionario.identificacao();
		novoFuncionario.ganhoAnual();
		novoFuncionario.recebePromocao(6000);
		novoFuncionario.ganhoAnual();
	}
}