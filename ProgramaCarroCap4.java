class ProgramaCarroCap4 {
	public static void main(String[] args) {
		CarroCap4 meuCarro = new CarroCap4();
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
	}
}