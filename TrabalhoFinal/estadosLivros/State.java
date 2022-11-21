package estadosLivros;

import biblioteca.Livro;

public abstract class State 
{
	protected Livro livro;
	
	public State (Livro livro)
	{
		this.livro = livro;
	}
	
	public abstract String emprestar();
	public abstract String reservar();
	public abstract String devolver();
}