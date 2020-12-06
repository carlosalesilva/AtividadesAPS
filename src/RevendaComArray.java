import java.util.ArrayList;

public class RevendaComArray {

	private ArrayList<Produto> produtos;
	private int indice = 0;
	int estoqueTotal;

	public RevendaComArray() {
		this.produtos = produtos;
		this.indice = indice;
		produtos = new ArrayList<Produto>();
	}

	public RevendaComArray(int qtdProduto) {
		produtos = new ArrayList<Produto>(qtdProduto);
	}

	void inserirProduto(Produto prod) {
		produtos.add(prod);
		indice += 1;
	}

	void comprar(int codigoProd, int qtdEstoque) {
		System.out.println(this.produtos);
		if (this.produtos.isEmpty()) {
			System.out.println("Não tem nenhum produto cadastrado!");
		}
		for (Produto produto : produtos) {
			if (produto.getCodigoProd() == codigoProd) {
				estoqueTotal += qtdEstoque;
				produto.setQtdEstoque(estoqueTotal);
				System.out.println(qtdEstoque + " Produtos Comprados!");
				estoqueTotal = 0;
			} else
				System.err.println("Produto não encontrado!");
		}
	}

	void vender(int codigoProd, int qtdEstoque) {
		for (Produto produto : produtos) {
			if (produto.getCodigoProd() == codigoProd) {
				estoqueTotal = produto.getQtdEstoque() - qtdEstoque;
				produto.setQtdEstoque(estoqueTotal);
				System.out.println(produto.getQtdEstoque());
			} else
				System.err.println("Produto não encontrado!");
		}
	}

	void consultarPreco(int codigoProd) {
		for (Produto produto : produtos) {
			if (produto.getCodigoProd() == codigoProd) {
				System.out.println(produto.calculaPrecoVenda());
			}
		}
	}

	void listarProd() {
		System.out.println(produtos.toString());
	}
	void listaPrecos() {
		for (Produto produto : produtos) {
			System.out.println("Código: " + produto.getCodigoProd() + "\n" + "Descrição: " + produto.getDescricao()
					+ "\n" + "Preço de venda: " + produto.calculaPrecoVenda());
			consultarPreco(indice);
			System.out.println("-----------------------------");
		}
	}

	void editarProd(int codigoProd, double custo, double valorCompra, double margemLucro) {
		for (Produto produto : produtos) {
			if (produto.getCodigoProd() == codigoProd) {
				produto.setCusto(custo);
				produto.setValorCompra(valorCompra);
				produto.setMargemLucro(margemLucro);
			} else
				System.err.println("Produto não encontrado!");
		}
	}

	void ConsultarProd(int codigoProd) {
		for (Produto produto : produtos) {
			if (produto.getCodigoProd() == codigoProd) {
				System.out.println("Valor que o produto foi comprado " + produto.getValorCompra() + "\n"
						+ "Custo do produto: " + produto.getCusto() + "\n" + "Margem de lucro do produto: "
						+ produto.getMargemLucro());
			}
		}
	}

}
