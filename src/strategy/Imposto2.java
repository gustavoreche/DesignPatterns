package strategy;

public class Imposto2 implements Imposto {

	@Override
	public double calcula(double valor) {
		//REGRA DO IMPOSTO 2
		return valor * 0.4;
	}

}
