package list.basico;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> carrinhoCompras;
	
	public CarrinhoDeCompras() {
		carrinhoCompras = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoCompras.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		for(int i =0; i<carrinhoCompras.size(); i++) {
			if (carrinhoCompras.get(i).getNome().equalsIgnoreCase(nome)) {
				carrinhoCompras.remove(i);
			}
		}
	}
	
	public int calcularValorTotal() {
		int valor = 0;
		
		for(Item i: carrinhoCompras) {
			valor += i.getQuantidade()*i.getPreco();
		}
		
		return valor;
	}
}
