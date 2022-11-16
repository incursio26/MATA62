package biblioteca;

public class Livro 
{
	public int codigo;
	public String titulo;
	public String editora;
	public String autores;
	public int edicao;
	public int publicacao;
	
	
	//gets & sets
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public int getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(int publicacao) {
		this.publicacao = publicacao;
	}	
}