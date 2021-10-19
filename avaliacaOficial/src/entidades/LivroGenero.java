package entidades;

public class LivroGenero extends Livros {
	
	protected String genero;

	

	public LivroGenero(String titulo,String autor, String sinopse, float preco, String genero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.sinopse = sinopse;
		this.preco = preco;
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
