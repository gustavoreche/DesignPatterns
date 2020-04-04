package decorator;

public class Main {
	
	public static void main(String[] args) {
		
		//ESCOLHER QUAL DESCONTO QUER UTILIZAR
		Desconto desconto = new DescontoValorIgual5Reais(new DescontoValorIgual10Reais());
//		Desconto desconto = new Imposto2();
//		Desconto desconto = new Imposto3();
		
		int valorVenda = 10;
		System.out.println("Valor venda: R$" + valorVenda + ". Desconto: R$:" + desconto.desconto(valorVenda));
		
	}

}
