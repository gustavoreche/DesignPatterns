package chainOfResponsibility;

public class DescontoValorIgual10Reais implements Desconto {

	private Desconto proximoDesconto;
	
	@Override
	public double desconto(double valor) {
		if(valor == 10) {
			return valor * 0.3;
		}
		return proximoDesconto.desconto(valor);
	}

	@Override
	public void proximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

}
