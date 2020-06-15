package observer;

import java.util.List;

public class ExecutaAposGerarNota {
	
	List<AcaoAposGerarNota> todasAcoesASeremExecutadas;
	
	public void executa(NotaFiscalPaulista nota) {
        for(AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
            acao.executa(nota);
          }		
	}

}
