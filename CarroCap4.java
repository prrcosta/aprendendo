class CarroCap4 {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	MotorCap4 motor;
	void liga() {
		System.out.println("O carro esta ligado");
	}
	void acelera(double quantidade) {
		this.velocidadeAtual += quantidade;
	}
	int pegaMarcha() {
		if (this.velocidadeAtual < 0) {
			return -1;
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
}