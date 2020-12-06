
public class Produto {
	private int codigoProd;	
	private String descricao;
	private double custo;
	private double valorCompra;
	private double margemLucro;
	private int qtdEstoque;
	
	void comprar(int quant) {
		qtdEstoque = qtdEstoque + quant;
	}
	
	void venda(int quant) {
		qtdEstoque = qtdEstoque - quant;
	}
	
	double calculaPrecoVenda() {
		return valorCompra + custo + margemLucro*(valorCompra + custo);
	}

	public Produto(int codigoprod, String descricao) {
		this.codigoProd = codigoprod;
		this.descricao = descricao;
	}

	public Produto(int codigoprod, String descricao, double custo, double valorCompra, double margemLucro) {
		this.codigoProd = codigoprod;
		this.descricao = descricao;
		this.custo = custo;
		this.valorCompra = valorCompra;
		this.margemLucro = margemLucro;
	}

	public Produto(int codigoprod, String descricao, double custo, double valorCompra, double margemLucro,int qtdEstoque) {
		this.codigoProd = codigoprod;
		this.descricao = descricao;
		this.custo = custo;
		this.valorCompra = valorCompra;
		this.margemLucro = margemLucro;
		this.qtdEstoque = qtdEstoque;
	}

	public int getCodigoProd() {
		return codigoProd;
	}

	public void setCodigoProd(int codigoProd) {
		this.codigoProd = codigoProd;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public double getCusto() {
		return custo;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}

	@Override
	public String toString() {
		return "Produto [codigoProd=" + codigoProd + ", descricao=" + descricao + ", custo=" + custo + ", valorCompra="
				+ valorCompra + ", margemLucro=" + margemLucro + ", qtdEstoque=" + qtdEstoque + "]";
	}
	
	
	
}
