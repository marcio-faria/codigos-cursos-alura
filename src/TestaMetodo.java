
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoMarcio = new Conta();
		contaDoMarcio.saldo = 100;
		contaDoMarcio.deposita(500);
		contaDoMarcio.titular = "Márcio Faria Santos";

		System.out.println("Saldo conta do Márcio: " + contaDoMarcio.saldo);

		boolean conseguiuSaca = contaDoMarcio.saca(6600);
		System.out.println(conseguiuSaca);

		System.out.println("Saldo conta do Márcio: " + contaDoMarcio.saldo);
		
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(5000);
		contaDaMarcela.titular = "Marcela Faria Santos";
		
		
		if(contaDaMarcela.transfere(300, contaDoMarcio)) {
			System.out.println("Transferência feita com sucesso!");
		}else {
			System.out.println("Faltou dinheiro!");
		}
		
		System.out.println(contaDoMarcio.titular);
		System.out.println("Saldo conta do Márcio: " + contaDoMarcio.saldo);
		
		System.out.println(contaDaMarcela.titular);
		System.out.println("Saldo conta da Marcela: " + contaDaMarcela.saldo);

	}

}
