package comportamental.chainOfResponsibility;

public class SemDesconto implements Desconto {

	@Override
	public double desconto(double valor) {
		return 0;
	}

	@Override
	public void proximoDesconto(Desconto proximoDesconto) {
		
	}

}
