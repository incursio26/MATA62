
public abstract class UsuarioDefault implements Usuario {
	private int codigo;
	private String nome;
	
	public UsuarioDefault(int codigo, String nome) 
	{
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() 	{
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

	public abstract void reservarLivro(Livro livroReserva);

	public abstract void pegarLivroEmprestado(Livro livroEmpresta);

	public abstract void devolverLivro(Livro livroDevolve);
}