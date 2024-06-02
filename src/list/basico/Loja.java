package list.basico;

public class Loja {

	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Arroz", 7.5, 3);
		carrinho.adicionarItem("Feijão", 8.0, 2);
		carrinho.adicionarItem("Carne", 12.0, 1);
		carrinho.adicionarItem("Arroz", 7.5, 1);
		carrinho.adicionarItem("Macarrão", 4.90, 5);
		
		System.out.println("O valor total do carrinho é: R$"+carrinho.calcularValorTotal());
		
		carrinho.removerItem("Arroz");
		System.out.println("O valor total do carrinho é: R$"+carrinho.calcularValorTotal());
		
		

	}

}
