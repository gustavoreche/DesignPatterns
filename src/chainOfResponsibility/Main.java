package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		
		Desconto d1 = new DescontoValorIgual5Reais();
		Desconto d2 = new DescontoValorIgual10Reais();
		Desconto d3 = new DescontoValorIgual15Reais();
		Desconto d4 = new SemDesconto();
		
		d1.proximoDesconto(d2);
		d2.proximoDesconto(d3);
		d3.proximoDesconto(d4);
		
		int valorVenda = 10;
		System.out.println("Valor venda: R$" + valorVenda + ". Desconto: R$:" + d1.desconto(valorVenda));
		
	}
	
}
