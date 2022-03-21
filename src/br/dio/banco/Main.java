package br.dio.banco;

public class Main {

	public static void main(String[] args) {
		Cliente sadraque =  new Cliente();
		sadraque.setNome("Sadraque");
		
		Conta cc = new ContaCorrente(sadraque);
		Conta poupanca = new ContaPoupanca(sadraque);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Cliente ana =  new Cliente();
		ana.setNome("ANA");
		
		Conta cc1 = new ContaCorrente(ana);
		Conta poupanca1 = new ContaPoupanca(ana);
		
		cc1.depositar(300);
		cc1.transferir(300, poupanca);
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		
		cc.imprimirListaCliente();
		cc1.imprimirListaCliente();
		
	}
}
