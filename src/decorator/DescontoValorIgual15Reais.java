package decorator;

public class DescontoValorIgual15Reais extends Desconto {

	public DescontoValorIgual15Reais() {
		super();
	}
	
	public DescontoValorIgual15Reais(Desconto outroDesconto) {
		super(outroDesconto);
	}
	
	public double desconto(double valor) {
		return valor * 0.8 + calculoDoOutroDesconto(valor);
	}

}
