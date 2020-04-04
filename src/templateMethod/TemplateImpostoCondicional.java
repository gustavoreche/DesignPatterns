package templateMethod;

public abstract class TemplateImpostoCondicional implements ImpostoCondicional {
	
	public double calcula(double valor) {
		if(usaTaxacao(valor)) {
			return taxacaoCondicional(valor);
		}
		return taxacaoMinima(valor);
	}
	
	public abstract boolean usaTaxacao(double valor);
	public abstract double taxacaoCondicional(double valor);
	public abstract double taxacaoMinima(double valor);

}
