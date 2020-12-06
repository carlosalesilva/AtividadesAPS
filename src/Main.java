import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RevendaComArray revenda = new RevendaComArray();
		Scanner scan = new Scanner(System.in);
		 int codigo;
		 String descricao;
		 double custo;
		 double valorCompra;
		 double margemLucro;
		 int qtdEstoque;
		 int escolha;
		 
		 while(true) {
			System.out.println( "|------------------------------|\n"
							   +"|Escolha uma opção:"+"            |\n"+  
								"|(1) Criar Produto             |\n"+
								"|(2) Comprar		       |\n"+
								"|(3) Vender       	       |\n"+
								"|(4) Consultar preço	       |\n"+
								"|(5) Listar preço	       |\n"+
								"|(6) Consultar e editar produto|\n"+
								"|(0) Sair		       |\n"
							  + "|------------------------------|");
		escolha = scan.nextInt();
		System.out.println("escolha = " + escolha);
		switch(escolha) {
		case 0: return;
		case 1:	System.out.println("Digite o código do produto: ");
		 codigo = scan.nextInt();
		 System.out.println("Digite a descrição do produto: ");
		 descricao = (scan.next());
		 System.out.println("Digite o custo do produto: ");
		 custo = scan.nextDouble();
		 System.out.println("Digite o valor de Compra do produto: ");
		 valorCompra = scan.nextDouble();
		 System.out.println("Digite a margem de lucro do produto: ");
		 margemLucro = scan.nextDouble();
		 Produto prod = new Produto(codigo,descricao,custo,valorCompra,margemLucro,0);
		 revenda.inserirProduto(prod);
		 revenda.listarProd();
		 System.out.println("Produto inserido com sucesso!");
		 break;
		case 2:System.out.println("Digite o códiogo do produto: ");
		 codigo = scan.nextInt();
		 System.out.println("Digite o quantos produtos deseja comprar: ");
		 qtdEstoque = scan.nextInt();
		 revenda.comprar(codigo, qtdEstoque);
		 break;
		case 3:System.out.println("Digite o código do produto: ");
		codigo = scan.nextInt();
		System.out.println("Digite quantas unidades vai vender: ");
		qtdEstoque = scan.nextInt();
		revenda.vender(codigo, qtdEstoque);
		 break;
		case 4:System.out.println("Digite o Código do produto: ");
		 codigo = scan.nextInt();
		 revenda.consultarPreco(codigo);
		 break;
		case 5:revenda.listaPrecos();
		break;
		case 6:System.out.println("Digite o código do produto: ");
		codigo = scan.nextInt();
		revenda.ConsultarProd(codigo);
		System.out.println("Digite o novo valor de compra: ");
		valorCompra = scan.nextDouble();
		System.out.println("Digite o novo custo: ");
		custo = scan.nextDouble();
		System.out.println("Digite a nova margem de lucro: ");
		margemLucro = scan.nextDouble();
		revenda.editarProd(codigo, custo, valorCompra, margemLucro);
		break;
			}
		}
	}
}

