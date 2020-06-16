package comportamental.templateMethod;

public class Imposto3 extends TemplateImpostoCondicional {

	@Override
	public boolean usaTaxacao(double valor) {
		return valor == 15;
	}

	@Override
	public double taxacaoCondicional(double valor) {
		return valor * 0.6;
	}

	@Override
	public double taxacaoMinima(double valor) {
		return valor * 0.3;
	}

}
