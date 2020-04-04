package decorator;

public class DescontoValorIgual10Reais extends Desconto {

	public DescontoValorIgual10Reais() {
		super();
	}
	
	public DescontoValorIgual10Reais(Desconto outroDesconto) {
		super(outroDesconto);
	}
	
	public double desconto(double valor) {
		return valor * 0.5 + calculoDoOutroDesconto(valor);
	}

}
