package estadosLivros;

import biblioteca.Livro;

public class Reservado extends State 
{
	public Reservado(Livro livro)
	{
		super(livro);
	}

	@Override
	public String emprestar() 
	{
		livro.setState(new Emprestado(livro));
		return "Sucesso: o livro foi emprestado.";
	}

	@Override
	public String reservar() 
	{
		return "Insucesso: não foi possível reservar, livro já está reservado";
	}

	@Override
	public String devolver() 
	{
		return "Insucesso: não foi possível devolver, livro não está emprestado";
	}
}