package templateMethod;

public class Imposto2 extends TemplateImpostoCondicional {

	@Override
	public boolean usaTaxacao(double valor) {
		return valor == 10;
	}

	@Override
	public double taxacaoCondicional(double valor) {
		return valor * 0.4;
	}

	@Override
	public double taxacaoMinima(double valor) {
		return valor * 0.2;
	}

}
