package strategy;

public class Imposto1 implements Imposto {

	@Override
	public double calcula(double valor) {
		//REGRA DO IMPOSTO 1
		return valor * 0.1;
	}

}
