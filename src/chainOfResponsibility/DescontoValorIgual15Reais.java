package chainOfResponsibility;

public class DescontoValorIgual15Reais implements Desconto {

	private Desconto proximoDesconto;
	
	@Override
	public double desconto(double valor) {
		if(valor == 15) {
			return valor * 0.5;
		}
		return proximoDesconto.desconto(valor);
	}

	@Override
	public void proximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

}
