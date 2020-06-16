package comportamental.observer;

public class EnviaEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscalPaulista notaFiscal) {
		System.out.println("executa tarefa...");
	}

}
