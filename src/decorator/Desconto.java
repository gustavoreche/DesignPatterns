package decorator;

public abstract class Desconto {
	
	private final Desconto outroDesconto;
	
	public Desconto(Desconto outroDesconto) {
		this.outroDesconto = outroDesconto;
	}
	
	public Desconto() {
		this.outroDesconto = null;
	}
	
	protected double calculoDoOutroDesconto(double valor) {
		if(this.outroDesconto == null) {
			return 0;
		}
		return this.outroDesconto.desconto(valor);
	}
	
	public abstract double desconto(double valor);
	
}
