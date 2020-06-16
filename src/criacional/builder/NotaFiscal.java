package criacional.builder;

import java.time.LocalDateTime;
import java.util.List;

@SuppressWarnings("unused")
public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private LocalDateTime dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> itens;
	private String observacoes;

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setDataDeEmissao(LocalDateTime dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public void setItens(List<ItemDaNota> itens) {
		this.itens = itens;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
