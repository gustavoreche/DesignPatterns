package comportamental.observer;

public class Main {
	
	public static void main(String[] args) {
		
		NotaFiscalPaulista notaFiscal = new NotaFiscalPaulista();
		
		// VAMOS IMAGINAR QUE TEMOS QUE EMITIR UMA NOTA FISCAL
		// AO TERMINAR DE EMITIR ESTA NOTA FISCAL, DEVEMOS REALIZAR DIVERSAS TAREFAS, COMO:
		// ENVIAR EMAIL, ENVIAR SMS, IMPRIMIR, ETC...
		
		new ExecutaAposGerarNota().executa(notaFiscal);
	}

}
