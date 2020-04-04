package templateMethod;

public class Imposto1 extends TemplateImpostoCondicional {

	@Override
	public boolean usaTaxacao(double valor) {
		return valor == 5;
	}

	@Override
	public double taxacaoCondicional(double valor) {
		return valor * 0.2;
	}

	@Override
	public double taxacaoMinima(double valor) {
		return valor * 0.1;
	}

}
