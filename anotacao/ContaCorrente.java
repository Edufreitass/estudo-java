package anotacao;

public class ContaCorrente extends Conta {
	
	// sobreescrevendo o metodo da classe Conta
	@Override
	public void deposita(double valor) {
		saldo += valor - 1;
	}

}
