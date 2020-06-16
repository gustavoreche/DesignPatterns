package comportamental.strategy;

public class Imposto3 implements Imposto {

	@Override
	public double calcula(double valor) {
		//REGRA DO IMPOSTO 3
		return valor * 0.7;
	}

}
