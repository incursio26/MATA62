package estadosLivros;

import biblioteca.Livro;

public class Emprestado extends State 
{
	public Emprestado(Livro livro)
	{
		super(livro);
	}

	@Override
	public String emprestar() 
	{
		return "Insucesso: Não foi possível emprestar, livro já está emprestado";
	}

	@Override
	public String reservar() 
	{
		livro.setState(new Reservado(livro));
		return "Sucesso: O livro foi reservado.";
	}

	@Override
	public String devolver() 
	{	
		livro.setState(new Devolver(livro));
		return "Sucesso: o livro foi devolvido.";
	}
}