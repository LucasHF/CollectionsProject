package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> catalogo; 
	
	public CatalogoLivros() {
		catalogo = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		catalogo.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> retorno = new ArrayList<>();
		for (Livro l: catalogo) {
			if(l.getAutor().equalsIgnoreCase(autor)) {
				retorno.add(l);
			}
		}
		return retorno;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> retorno = new ArrayList<>();
		for (Livro l: catalogo) {
			if(l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao()<=anoFinal) {
				retorno.add(l);
			}
		}
		return retorno;
	}
	
	public List<Livro> pesquisarPorTitulo(String titulo) {
		List<Livro> retorno = new ArrayList<>();
		for (Livro l: catalogo) {
			if(l.getTitulo().equalsIgnoreCase(titulo)) {
				retorno.add(l);
			}
		}
		return retorno;
	}
	
}
