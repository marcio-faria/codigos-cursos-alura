
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.agencia = 001;
		primeiraConta.numero = 00001;
		primeiraConta.saldo = 100;
		primeiraConta.titular = "Márcio Faria Santos";

		System.out.println("Agencia: " + primeiraConta.agencia);
		System.out.println("Número: " + primeiraConta.numero);
		System.out.println("Saldo: " + primeiraConta.saldo);
		System.out.println("Titular: " + primeiraConta.titular);

		System.out.println("Novo saldo: " + (primeiraConta.saldo += 100));

		System.out.println();

		Conta segundaConta = new Conta();
		segundaConta.agencia = 001;
		segundaConta.numero = 00002;
		segundaConta.saldo = 50;
		segundaConta.titular = "Celeste Souza Leão";

		System.out.println("Agência: " + segundaConta.agencia);
		System.out.println("Número: " + segundaConta.numero);
		System.out.println("Saldo: " + segundaConta.saldo);
		System.out.println("Titular: " + segundaConta.titular);
		System.out.println("Novo saldo: " + (segundaConta.saldo += 350));

	}

}
