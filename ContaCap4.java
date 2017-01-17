class ContaCap4 {
	int numero;
	double saldo;
	double limite;
	ClienteCap4 titular = new ClienteCap4();
	
	boolean saca(double dinheiro) {
		if (this.saldo >= dinheiro) {
			this.saldo -= dinheiro;
			return true;
		}
		else {
			return false;
		}
	}
	void deposita(double dinheiro) {
		this.saldo += dinheiro;
	}
	boolean transferePara(ContaCap4 destino, double dinheiro) {
		if(this.saca(dinheiro) == true) {
			destino.deposita(dinheiro);
			return true;
		}
		else {
			return false;
		}
	}
}