package observer;

public class Imprime implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscalPaulista notaFiscal) {
		System.out.println("executa tarefa...");
	}

}
