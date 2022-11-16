package operacoes;

import biblioteca.Usuario;
import estadosUsuarios.IDevedor;

public class Emprestar implements IDevedor
{
	public void emprestar(String emp, int codigoLivro, int codigoUsuario) 
	{
		//verifica se usuário é devedor
		for (Usuario devedor: devedores)
	    {
	        if(codigoUsuario == devedor.getCodigo())
	        {
	        	System.out.println("Insucesso: o usuário está devedor.");
	        	return;
	        }
	    }
		
		System.out.println("Sucesso: livro emprestado. Código do livro: " + codigoLivro + " Código do usuário: " + codigoUsuario);
	}
}