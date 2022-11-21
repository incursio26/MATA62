package estadosLivros;

import biblioteca.Livro;

public class Devolver extends State
{
	public Devolver (Livro livro)
	{
		super(livro);
	}

	@Override
	public String emprestar() 
	{
		System.out.println("Insucesso: não foi possível devolver, livro já está devolvido1");
		livro.setState(new Emprestado(livro));
		return "Sucesso: o livro foi emprestado.";
	}

	@Override
	public String reservar() 
	{
		System.out.println("Insucesso: não foi possível devolver, livro já está devolvido2");
		livro.setState(new Reservado(livro));
		return "Sucesso: o livro foi reservado.";
	}
	@Override
	public String devolver() 
	{
		System.out.println("Insucesso: não foi possível devolver, livro já está devolvido");
		return "Insucesso: não foi possível devolver, livro já está devolvido";
	
	}
}