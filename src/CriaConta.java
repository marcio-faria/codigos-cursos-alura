
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.agencia = 001;
		primeiraConta.numero = 00001;
		primeiraConta.saldo = 100;
		primeiraConta.titular = "M�rcio Faria Santos";

		System.out.println("Agencia: " + primeiraConta.agencia);
		System.out.println("N�mero: " + primeiraConta.numero);
		System.out.println("Saldo: " + primeiraConta.saldo);
		System.out.println("Titular: " + primeiraConta.titular);

		System.out.println("Novo saldo: " + (primeiraConta.saldo += 100));

		System.out.println();

		Conta segundaConta = new Conta();
		segundaConta.agencia = 001;
		segundaConta.numero = 00002;
		segundaConta.saldo = 50;
		segundaConta.titular = "Celeste Souza Le�o";

		System.out.println("Ag�ncia: " + segundaConta.agencia);
		System.out.println("N�mero: " + segundaConta.numero);
		System.out.println("Saldo: " + segundaConta.saldo);
		System.out.println("Titular: " + segundaConta.titular);
		System.out.println("Novo saldo: " + (segundaConta.saldo += 350));

	}

}
