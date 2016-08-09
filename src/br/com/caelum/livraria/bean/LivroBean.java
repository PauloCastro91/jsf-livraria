package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "livroBean")
public class LivroBean {

	private Livro livro = new Livro();   

	public void gravar() {
		System.out.println("Gravando Livro" + " titulo: " + livro.titulo + " isbn: " + livro.isbn + " preco: "
				+ livro.preco + " dataLancamento: " + livro.dataLancamento);
	}

	public Livro getLivro() {
		return livro; 
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
