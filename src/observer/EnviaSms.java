package observer;

public class EnviaSms implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscalPaulista notaFiscal) {
		System.out.println("executa tarefa...");
	}

}
