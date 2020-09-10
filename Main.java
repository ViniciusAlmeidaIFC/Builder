package builderPattern;

public class Main {

	public static void main(String[] args) {
		ContaBanco conta = new ContaBanco.Builder(1234L)
				.withNome("Vinicius")
				.atRamo("São Joaquim")
				.openingValor(1000)
				.atJuro(2.5)
				.build();
		
		ContaBanco outraConta = new ContaBanco.Builder(4567L)
				.withNome("Claudio")
				.atRamo("São Joaquim")
				.openingValor(100)
				.atJuro(1.5)
				.build();

		System.out.println(conta);
		System.out.println(outraConta);

	}

}
