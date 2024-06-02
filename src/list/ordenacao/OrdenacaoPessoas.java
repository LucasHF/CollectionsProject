package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	
	public List<Pessoa> listaPessoas;
	
	public OrdenacaoPessoas() {
		listaPessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> idadeOrdenada = new ArrayList<>(listaPessoas);
		
		Collections.sort(idadeOrdenada);
		
		return idadeOrdenada;
	}

	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> alturaOrdenada = new ArrayList<>(listaPessoas);
		
		Collections.sort(alturaOrdenada, new ComparadorAltura());
		
		return alturaOrdenada;
	}
}
