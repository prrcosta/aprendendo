class ProgramaContaCap4 {
	public static void main(String[] args) {
		ContaCap4 minhaConta = new ContaCap4();
		ContaCap4 meuSonho = new ContaCap4();
		
		minhaConta.titular.nome = "Duke";
		minhaConta.saldo = 1000;
		meuSonho.titular.nome = "Rico";
		meuSonho.saldo = 1500000;
		
		System.out.println("Titular da Conta "+minhaConta.titular.nome);
		System.out.println("Saldo: "+minhaConta.saldo);
		
		if (minhaConta.saca(2000)) {
			System.out.println("Saque bem sucedido");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
			
		System.out.println("Saldo: "+minhaConta.saldo);
		
		minhaConta.deposita(500);
		System.out.println("Deposito bem sucedido");
		System.out.println("Saldo: "+minhaConta.saldo);
		
		if (minhaConta.transferePara(meuSonho, 2000)) {
			System.out.println("Transferencia bem sucedida");
		}
		else {
			System.out.println("Saldo insuficiente para realizar transferencia");
		}
	}
}