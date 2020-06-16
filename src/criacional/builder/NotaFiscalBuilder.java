package criacional.builder;

import java.time.LocalDateTime;
import java.util.List;

public class NotaFiscalBuilder {
	
	private NotaFiscal objeto;

	public NotaFiscalBuilder() {
		this.objeto = new NotaFiscal();
	}
	
	public NotaFiscalBuilder setRazaoSocial(String razaoSocial) {
		this.objeto.setRazaoSocial(razaoSocial);
		return this;
	}
	
	
	public NotaFiscalBuilder setCnpj(String cnpj) {
		this.objeto.setCnpj(cnpj);
		return this;
	}
	
	public NotaFiscalBuilder setDataDeEmissao(LocalDateTime dataDeEmissao) {
		this.objeto.setDataDeEmissao(dataDeEmissao);
		return this;
	}
	
	public NotaFiscalBuilder setValorBruto(double valorBruto) {
		this.objeto.setValorBruto(valorBruto);
		return this;
	}
	
	public NotaFiscalBuilder setImpostos(double impostos) {
		this.objeto.setImpostos(impostos);
		return this;
	}
	
	public NotaFiscalBuilder setItens(List<ItemDaNota> itens) {
		this.objeto.setItens(itens);
		return this;
	}
	
	public NotaFiscalBuilder setObservacoes(String observacoes) {
		this.objeto.setObservacoes(observacoes);
		return this;
	}
	
	public NotaFiscal retornaObjeto() {
		return this.objeto;
	}
	
}
