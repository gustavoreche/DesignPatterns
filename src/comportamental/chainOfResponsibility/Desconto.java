package comportamental.chainOfResponsibility;

public interface Desconto {
	
	double desconto(double valor);
	void proximoDesconto(Desconto proximoDesconto);
	
}
