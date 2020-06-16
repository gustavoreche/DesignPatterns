package comportamental.chainOfResponsibility;

public class DescontoValorIgual5Reais implements Desconto {

	private Desconto proximoDesconto;
	
	@Override
	public double desconto(double valor) {
		if(valor == 5) {
			return valor * 0.1;
		}
		return proximoDesconto.desconto(valor);
	}

	@Override
	public void proximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

}
