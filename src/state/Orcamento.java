package state;

public class Orcamento {
	
	protected double valor;
    protected EstadoDeUmOrcamento estadoAtual;

    public Orcamento(double valor) {
      this.estadoAtual = new EmAprovacao();
      this.valor = valor;
    }

    public void aplicaDescontoExtra() {
      estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
      estadoAtual.aprova(this);
    }

    public void reprova() {
      estadoAtual.reprova(this);
    }

    public void finaliza() {
      estadoAtual.finaliza(this);
    }
    
    public double getValor() {
		return valor;
	}

}
