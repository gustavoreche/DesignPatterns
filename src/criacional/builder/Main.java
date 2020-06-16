package criacional.builder;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		NotaFiscal notaFiscal = new NotaFiscalBuilder()
				.setRazaoSocial("123456789")
				.setCnpj("123456789")
				.setDataDeEmissao(LocalDateTime.now())
				.setImpostos(10)
				.setItens(new LinkedList<ItemDaNota>())
				.setObservacoes("Autorizado")
				.setValorBruto(50)
				.retornaObjeto();
	}

}
