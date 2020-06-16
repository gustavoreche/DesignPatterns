package comportamental.state;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// nao pode ser reprovado agora!
		throw new RuntimeException("Or�amento j� est� em estado de reprova��o e n�o pode ser aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// jah estou em reprovacao
		throw new RuntimeException("Or�amento est� em estado de reprova��o");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// daqui posso ir para o estado de finalizado
		orcamento.estadoAtual = new Finalizado();
	}

}
