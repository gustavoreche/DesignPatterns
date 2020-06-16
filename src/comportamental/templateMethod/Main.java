package comportamental.templateMethod;

public class Main {
	
	public static void main(String[] args) {
		
		//ESCOLHER QUAL IMPOSTO QUER UTILIZAR
		TemplateImpostoCondicional impostoEscolhido = new Imposto1();
//		TemplateImpostoCondicional impostoEscolhido = new Imposto2();
//		TemplateImpostoCondicional impostoEscolhido = new Imposto3();
		
		int valorVenda = 3;
		System.out.println("Valor venda: R$" + valorVenda + ". Imposto: R$:" + impostoEscolhido.calcula(valorVenda));
	}

}
