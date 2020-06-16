package estrutural.decorator;

public class DescontoValorIgual5Reais extends Desconto {

	public DescontoValorIgual5Reais() {
		super();
	}
	
	public DescontoValorIgual5Reais(Desconto outroDesconto) {
		super(outroDesconto);
	}
	
	public double desconto(double valor) {
		return valor * 0.2 + calculoDoOutroDesconto(valor);
	}

}
