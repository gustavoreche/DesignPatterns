package strategy;

public class Main {
	
	public static void main(String[] args) {
		
		//ESCOLHER QUAL IMPOSTO QUER UTILIZAR
		Imposto impostoEscolhido = new Imposto1();
//		Imposto impostoEscolhido = new Imposto2();
//		Imposto impostoEscolhido = new Imposto3();
		
		int valorVenda = 100;
		System.out.println("Valor venda: R$" + valorVenda + ". Imposto: R$:" + impostoEscolhido.calcula(valorVenda));
	}

}
