package notificacao;

import java.util.*;
import java.io.*;

public class ServicoNotificacao 
{
	private List<ServicoNotificacao> usuarios 	= new ArrayList<ServicoNotificacao>();
				  
	public ServicoNotificacao()
	{
		usuarios = new ArrayList<>();
	}
	
//	public void inscrever(Ouvintes ouvinte)
//	{
	//	usuarios.add(ouvinte);
//	}
	
	public void desinscrever(Ouvintes ouvinte)
	{
		usuarios.remove(ouvinte);
	}
	
	public void notificar()
	{
		usuarios.forEach(ouvinte -> ouvinte.update());
	}

	private Object update() {
		// TODO Auto-generated method stub
		return null;
	}
}